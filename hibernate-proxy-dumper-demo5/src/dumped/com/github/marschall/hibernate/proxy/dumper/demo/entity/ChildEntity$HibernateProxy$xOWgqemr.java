package com.github.marschall.hibernate.proxy.dumper.demo.entity;

import java.lang.reflect.Method;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.LazyInitializer;
import org.hibernate.proxy.ProxyConfiguration;
import org.hibernate.proxy.ProxyConfiguration.InterceptorDispatcher;

public class ChildEntity$HibernateProxy$xOWgqemr extends ChildEntity implements HibernateProxy, ProxyConfiguration {
   private ProxyConfiguration.Interceptor $$_hibernate_interceptor;
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$4cscpe1 = Object.class.getMethod("toString");
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$uoilpf3 = ChildEntity.class.getMethod("setParentId", Long.class);
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$o23rrk2 = HibernateProxy.class.getMethod("getHibernateLazyInitializer");
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$epb7v62 = ChildEntity.class.getMethod("getChildId");
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$5j4bem0 = Object.class.getMethod("equals", Object.class);
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$gpia792 = HibernateProxy.class.getMethod("writeReplace");
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$7m9oaq0 = Object.class.getDeclaredMethod("clone");
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$9pqdof1 = Object.class.getMethod("hashCode");
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$cim0uj0 = ChildEntity.class.getMethod("setChildId", Long.class);
   // $FF: synthetic field
   private static final Method cachedValue$z9p4zq9z$8j4rtp1 = ChildEntity.class.getMethod("getParentId");

   public boolean equals(Object var1) {
      return (Boolean)InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$5j4bem0, new Object[]{var1}, false, this.$$_hibernate_interceptor);
   }

   public String toString() {
      return (String)InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$4cscpe1, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public int hashCode() {
      return (Integer)InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$9pqdof1, new Object[0], 0, this.$$_hibernate_interceptor);
   }

   protected Object clone() throws CloneNotSupportedException {
      return InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$7m9oaq0, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public void setParentId(Long var1) {
      InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$uoilpf3, new Object[]{var1}, (Object)null, this.$$_hibernate_interceptor);
   }

   public void setChildId(Long var1) {
      InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$cim0uj0, new Object[]{var1}, (Object)null, this.$$_hibernate_interceptor);
   }

   public Long getChildId() {
      return (Long)InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$epb7v62, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public Long getParentId() {
      return (Long)InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$8j4rtp1, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public Object writeReplace() {
      return InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$gpia792, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public LazyInitializer getHibernateLazyInitializer() {
      return (LazyInitializer)InterceptorDispatcher.intercept(this, cachedValue$z9p4zq9z$o23rrk2, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public void $$_hibernate_set_interceptor(ProxyConfiguration.Interceptor var1) {
      this.$$_hibernate_interceptor = var1;
   }
}
