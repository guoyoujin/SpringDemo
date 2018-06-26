package com.trycatch.data.jpa.txhims.repository.dao.impl;

import com.trycatch.data.jpa.txhims.repository.dao.UserDao;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("com.trycatch.data.jpa.txhims.repository.dao.impl.UserDaoImpl")
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    @Resource(name = "txhimsEntityManager")
    @Qualifier(value = "txhimsEntityManager")
    private EntityManager entityManager;
    private final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public List<UserEntity> findAll() {
        logger.info("UserDaoImpl  findAll  =======================");
        return this.entityManager
                .createQuery("select t from UserEntity t", UserEntity.class)
                .getResultList();
    }

    @Override
    public UserEntity find(Long id) {
        return this.entityManager
                .createQuery("select t from UserEntity t where t.id = :id ", UserEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public UserEntity findTest(Long id) {
        return this.entityManager
                .createQuery("select t from UserEntity t where t.id = :id ", UserEntity.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
