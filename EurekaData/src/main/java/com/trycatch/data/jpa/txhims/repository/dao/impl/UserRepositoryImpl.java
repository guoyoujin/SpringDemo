package com.trycatch.data.jpa.txhims.repository.dao.impl;

import com.trycatch.data.jpa.txhims.repository.TxhimsEntityManager;
import com.trycatch.data.jpa.txhims.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.trycatch.data.jpa.txhims.repository.dao.impl.UserRepositoryImpl")
public class UserRepositoryImpl extends TxhimsEntityManager implements UserRepositoryCustom{

    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Override
    public List<UserEntity> findAll() {
        logger.info("===========  txhims UserRepositoryImpl  findAll  =======================");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txhims.entity.UserEntity t", UserEntity.class)
                .getResultList();
    }

    @Override
    public UserEntity find(Long id) {
        logger.info("=========== txhims UserRepositoryImpl  find  =======================");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txhims.entity.UserEntity t where t.id = :id ", UserEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public UserEntity findTest(Long id) {
        logger.info("=========== txhims UserRepositoryImpl  findTest  =======================");
        return  this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txhims.entity.UserEntity t where t.id = :id ", UserEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
