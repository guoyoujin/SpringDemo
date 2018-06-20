package com.trycatch.data.jpa.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class EntityListener {
    @PrePersist
    public void prePersist(CommonEntity entity) {
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
    }

    @PreUpdate
    public void preUpdate(CommonEntity entity){
        entity.setUpdatedAt(new Date());
    }
}
