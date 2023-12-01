Hibernate Proxy Dumper
======================

A java agent that dumps Hibernate proxiees.

[Please release fernflower decompiler as a standalone jar](https://youtrack.jetbrains.com/issue/IDEA-175638/Please-release-fernflower-decompiler-as-a-standalone-jar)

```
mvn dependency:get \
  -DrepoUrl=https://www.jetbrains.com/intellij-repository/releases/ \
  -Dartifact=com.jetbrains.intellij.java:java-decompiler-engine:LATEST \
  -Ddest=.
```

A Hibernate Proxy will look something like this

```java
public class Entity$HibernateProxy$iPrgCr9u extends Entity implements HibernateProxy, ProxyConfiguration {
   private ProxyConfiguration.Interceptor $$_hibernate_interceptor;

   // $FF: synthetic field
   private static final Method cachedValue$xVIlXpzP$8j4rtp1 = Entity.class.getMethod("interceptedMethod");

   public ReturnValue interceptedMethod() {
      return (ReturnValue)InterceptorDispatcher.intercept(this, cachedValue$xVIlXpzP$8j4rtp1, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public void $$_hibernate_set_interceptor(ProxyConfiguration.Interceptor interceptor) {
      this.$$_hibernate_interceptor = interceptor;
   }
   
}
```