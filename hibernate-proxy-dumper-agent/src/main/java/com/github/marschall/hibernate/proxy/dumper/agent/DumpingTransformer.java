package com.github.marschall.hibernate.proxy.dumper.agent;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.instrument.ClassFileTransformer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.ProtectionDomain;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Does not actually transform classes. Instead only dumps Hibernate proxy classes.
 */
final class DumpingTransformer implements ClassFileTransformer {

  private final Path basePath;

  DumpingTransformer(Path basePath) {
    this.basePath = basePath;
  }

  @Override
  public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) {
    boolean isBootstrapLoader = loader == null;
    if (!isBootstrapLoader) {
      boolean isClassLoad = classBeingRedefined == null;
      if (isClassLoad) {
        boolean isHibernateProxyClass = className.contains("$HibernateProxy$");
        if (isHibernateProxyClass) {
          dumpClassFile(className, classfileBuffer);
        }
      }
    }
    // we never transform anything
    return null;
  }

  private void dumpClassFile(String className, byte[] classfileBuffer) {
    // java class format uses / instead of .
    Path destination = basePath.resolve(className + ".class");
    try {
      Files.createDirectories(destination.getParent());
      try (OutputStream outputStream = Files.newOutputStream(destination, CREATE, TRUNCATE_EXISTING, WRITE)) {
        outputStream.write(classfileBuffer);
      }
    } catch (IOException e) {
      Logger.getLogger(DumpingTransformer.class.getName()).log(Level.SEVERE, "could not dump class: " + className, e);
    }
  }

}
