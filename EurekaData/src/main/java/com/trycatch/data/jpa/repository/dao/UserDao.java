package com.trycatch.data.jpa.repository.dao;

import com.trycatch.data.jpa.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserDao {
    List<UserEntity> findAll();
    UserEntity find(Long id);
    UserEntity findTest(Long id);
}
