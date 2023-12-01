package com.github.marschall.hibernate.proxy.dumper.agent;

import java.lang.instrument.Instrumentation;

public final class Agent {

  public static void premain(String arguments, Instrumentation instrumentation) {
    instrumentation.addTransformer(new DumpingTransformer());
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
