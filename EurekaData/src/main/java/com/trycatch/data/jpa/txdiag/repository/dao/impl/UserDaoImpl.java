package com.trycatch.data.jpa.txdiag.repository.dao.impl;

import com.trycatch.data.jpa.txdiag.repository.dao.UserDao;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("com.trycatch.data.jpa.txdiag.repository.dao.impl.UserDaoImpl")
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    @Resource(name = "txdiagEntityManager")
    @Qualifier(value = "txdiagEntityManager")
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UserEntity> findAll() {
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
