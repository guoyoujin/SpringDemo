package com.trycatch.data.jpa.repository.dao.impl;

import com.trycatch.data.jpa.entity.UserEntity;
import com.trycatch.data.jpa.repository.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
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
