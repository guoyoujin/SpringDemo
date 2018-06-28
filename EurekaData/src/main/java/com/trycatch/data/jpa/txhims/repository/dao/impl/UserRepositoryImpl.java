package com.trycatch.data.jpa.txhims.repository.dao.impl;

import com.trycatch.data.jpa.txhims.repository.TxhimsEntityManager;
import com.trycatch.data.jpa.txhims.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txhims.entity.UserTestEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.trycatch.data.jpa.txhims.repository.dao.impl.UserRepositoryImpl")
public class UserRepositoryImpl extends TxhimsEntityManager implements UserRepositoryCustom<UserTestEntity,Long> {

    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Override
    public List<UserTestEntity> findAll() {
        logger.info("===========  txhims UserRepositoryImpl  findAll  =======================");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txhims.entity.UserTestEntity t", UserTestEntity.class)
                .getResultList();
    }

    @Override
    public UserTestEntity find(Long id) {
        logger.info("=========== txhims UserRepositoryImpl  find  =======================");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txhims.entity.UserTestEntity t where t.id = :id ", UserTestEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public UserTestEntity findTest(Long id) {
        logger.info("=========== txhims UserRepositoryImpl  findTest  =======================");
        return  this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txhims.entity.UserTestEntity t where t.id = :id ", UserTestEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
