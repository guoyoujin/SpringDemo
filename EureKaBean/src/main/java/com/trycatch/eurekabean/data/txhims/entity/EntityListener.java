package com.trycatch.eurekabean.data.txhims.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class EntityListener {
    private static final long serialVersionUID= 2131112312313123123L;
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
