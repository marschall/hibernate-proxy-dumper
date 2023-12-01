package com.github.marschall.hibernate.proxy.dumper.demo.entity;

import java.lang.reflect.Method;
import java.util.Set;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.LazyInitializer;
import org.hibernate.proxy.ProxyConfiguration;
import org.hibernate.proxy.ProxyConfiguration.InterceptorDispatcher;

public class ParentEntity$HibernateProxy$zaiYaxZB extends ParentEntity implements HibernateProxy, ProxyConfiguration {
   private ProxyConfiguration.Interceptor $$_hibernate_interceptor;
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$4cscpe1 = Object.class.getMethod("toString");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$o23rrk2 = HibernateProxy.class.getMethod("getHibernateLazyInitializer");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$497t4c0 = ParentEntity.class.getMethod("setChildren", Set.class);
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$5j4bem0 = Object.class.getMethod("equals", Object.class);
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$gpia792 = HibernateProxy.class.getMethod("writeReplace");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$7m9oaq0 = Object.class.getDeclaredMethod("clone");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$9pqdof1 = Object.class.getMethod("hashCode");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$o1l42h0 = ParentEntity.class.getMethod("setParentId", Long.class);
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$a83mts0 = ParentEntity.class.getMethod("getChildren");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$2s6a6r2 = ParentEntity.class.getMethod("getParentId");
   // $FF: synthetic field
   private static final Method cachedValue$9eRjOBIH$fede383 = ParentEntity.class.getMethod("addChild", ChildEntity.class);

   public boolean equals(Object var1) {
      return (Boolean)InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$5j4bem0, new Object[]{var1}, false, this.$$_hibernate_interceptor);
   }

   public String toString() {
      return (String)InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$4cscpe1, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public int hashCode() {
      return (Integer)InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$9pqdof1, new Object[0], 0, this.$$_hibernate_interceptor);
   }

   protected Object clone() throws CloneNotSupportedException {
      return InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$7m9oaq0, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public void setParentId(Long var1) {
      InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$o1l42h0, new Object[]{var1}, (Object)null, this.$$_hibernate_interceptor);
   }

   public void setChildren(Set var1) {
      InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$497t4c0, new Object[]{var1}, (Object)null, this.$$_hibernate_interceptor);
   }

   public Set getChildren() {
      return (Set)InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$a83mts0, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public Long getParentId() {
      return (Long)InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$2s6a6r2, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public void addChild(ChildEntity var1) {
      InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$fede383, new Object[]{var1}, (Object)null, this.$$_hibernate_interceptor);
   }

   public Object writeReplace() {
      return InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$gpia792, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public LazyInitializer getHibernateLazyInitializer() {
      return (LazyInitializer)InterceptorDispatcher.intercept(this, cachedValue$9eRjOBIH$o23rrk2, new Object[0], (Object)null, this.$$_hibernate_interceptor);
   }

   public void $$_hibernate_set_interceptor(ProxyConfiguration.Interceptor var1) {
      this.$$_hibernate_interceptor = var1;
   }
}
