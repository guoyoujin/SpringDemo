package com.trycatch.eurekabean.data.txhims.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity extends CommonEntity {
    private static final long serialVersionUID= 213111232313123113L;
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

