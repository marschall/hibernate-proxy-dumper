package com.github.marschall.hibernate.proxy.dumper.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import com.github.marschall.hibernate.proxy.dumper.demo.configuration.H2Configuration;
import com.github.marschall.hibernate.proxy.dumper.demo.entity.ChildEntity;
import com.github.marschall.hibernate.proxy.dumper.demo.entity.ParentEntity;

@Rollback
@Transactional
@SpringJUnitConfig(classes = H2Configuration.class)
class ProxyTests {

  @PersistenceContext
  private EntityManager entityManager;

  @Test
  void loadProxies() {
    ParentEntity parent = this.entityManager.find(ParentEntity.class, 1L);
    assertNotNull(parent);
    Set<ChildEntity> children = parent.getChildren();
    assertNotNull(children);
  }

}
