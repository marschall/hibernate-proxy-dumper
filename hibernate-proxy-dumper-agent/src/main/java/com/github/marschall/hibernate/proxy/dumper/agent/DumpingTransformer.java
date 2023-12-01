package com.github.marschall.hibernate.proxy.dumper.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

final class DumpingTransformer implements ClassFileTransformer {

  @Override
  public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
    boolean isClassLoad = classBeingRedefined == null;
    if (isClassLoad) {
      boolean isHibernateProxyClass = className.contains("$HibernateProxy$");
    }
    return null;
  }

}
