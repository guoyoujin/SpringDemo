package com.trycatch.eurekabean.data.txhims.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@EntityListeners({EntityListener.class})
@MappedSuperclass
public class CommonEntity implements Serializable {
    @Column(name="created_at")
    private Date createdAt;
    @Column(name="updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

