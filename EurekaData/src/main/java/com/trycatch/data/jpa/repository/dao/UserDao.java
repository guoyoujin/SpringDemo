package com.trycatch.data.jpa.repository.dao;

import com.trycatch.eurekabean.data.entity.UserEntity;

import java.util.List;
public interface UserDao {
    List<UserEntity> findAll();
    UserEntity find(Long id);
    UserEntity findTest(Long id);
}
