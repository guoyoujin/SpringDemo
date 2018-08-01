package com.trycatch.eurekabean.data.txdiag.entity;


import javax.persistence.*;

@MappedSuperclass
public class BaseIdEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id",columnDefinition = " COMMENT '自增长ID' ")
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}

