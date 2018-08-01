package com.trycatch.eurekabean.data.txdiag.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@MappedSuperclass
public class UuidBaseEntity extends BaseEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

