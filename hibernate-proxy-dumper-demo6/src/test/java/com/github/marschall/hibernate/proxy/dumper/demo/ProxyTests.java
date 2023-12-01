package com.github.marschall.hibernate.proxy.dumper.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Set;

import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.ProxyConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import com.github.marschall.hibernate.proxy.dumper.demo.configuration.H2Configuration;
import com.github.marschall.hibernate.proxy.dumper.demo.entity.ChildEntity;
import com.github.marschall.hibernate.proxy.dumper.demo.entity.ParentEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Rollback
@Transactional
@SpringJUnitConfig(classes = H2Configuration.class)
class ProxyTests {

  @PersistenceContext
  private EntityManager entityManager;

  @Test
  void loadProxies() {
    ParentEntity parent = this.entityManager.getReference(ParentEntity.class, 1L);
//    ParentEntity parent = this.entityManager.find(ParentEntity.class, 1L);
    assertNotNull(parent);
    Class<? extends ParentEntity> parentClass = parent.getClass();
    assertNotSame(parentClass, ParentEntity.class);
    assertSame(ParentEntity.class, parentClass.getSuperclass());
    Class<?>[] interfaces = parentClass.getInterfaces();
    assertArrayEquals(new Class[] {HibernateProxy.class, ProxyConfiguration.class}, interfaces);
    Set<ChildEntity> children = parent.getChildren();
    assertNotNull(children);
  }

}
