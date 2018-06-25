package com.trycatch.eurekabean.data.txhims.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id" )
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}

