package com.github.marschall.hibernate.proxy.dumper.demo.entity;

import static javax.persistence.FetchType.LAZY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "PARENT_ENTITY")
public class ParentEntity {

  @Id
  @Column(name = "PARENT_ID")
  private Long parentId;

  @OneToMany(fetch = LAZY)
  @JoinColumn(name = "PARENT_ID")
  private Set<ChildEntity> children = new HashSet<>();

  public Long getParentId() {
    return this.parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Set<ChildEntity> getChildren() {
    return this.children;
  }

  public void setChildren(Set<ChildEntity> children) {
    this.children = children;
  }

  public void addChild(ChildEntity child) {
    this.children.add(child);
  }

}
