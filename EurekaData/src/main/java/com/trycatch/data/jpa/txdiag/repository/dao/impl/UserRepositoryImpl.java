package com.trycatch.data.jpa.txdiag.repository.dao.impl;

import com.trycatch.data.jpa.txdiag.repository.TxdiagEntityManager;
import com.trycatch.data.jpa.txdiag.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.trycatch.data.jpa.txdiag.repository.dao.impl.UserRepositoryImpl")
public class UserRepositoryImpl extends TxdiagEntityManager implements UserRepositoryCustom{
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Override
    public List<UserEntity> findAll() {
        logger.info("=========== txdiag UserRepositoryImpl   findAll()");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txdiag.entity.UserEntity t", UserEntity.class)
                .getResultList();
    }

    @Override
    public UserEntity find(Long id) {
        logger.info("=========== txdiag UserRepositoryImpl   find()");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txdiag.entity.UserEntity t where t.id = :id ", UserEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public UserEntity findTest(Long id) {
        logger.info("=========== txdiag UserRepositoryImpl   findTest()");
        return this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txdiag.entity.UserEntity t where t.id = :id ", UserEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
