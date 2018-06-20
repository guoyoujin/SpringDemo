package com.trycatch.data.jpa.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id" )
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}

