package com.github.marschall.hibernate.proxy.dumper.agent;

import java.lang.instrument.Instrumentation;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class Agent {

  public static void premain(String arguments, Instrumentation instrumentation) {
    Path basePath;
    if (arguments != null && !arguments.isEmpty()) {
      basePath = Paths.get(arguments);
    } else {
      basePath = Paths.get("");
    }
    instrumentation.addTransformer(new DumpingTransformer(basePath));
//    new AgentBuilder.Default()
//    // the class named SchedulerService
//    .type(ElementMatchers.nameEndsWith(".SchedulerService"))
//    .transform((builder, type, classLoader, module) ->  builder.method(
//              // all synchronized methods except load and unload
//              isSynchronized().and(not(named("load").or(named("unload")))))
//            .intercept(SuperMethodCall.INSTANCE)
//            // remove synchronized
//            .transform(withModifiers(SynchronizationState.PLAIN)))
//    .installOn(instrumentation);
  }

}
