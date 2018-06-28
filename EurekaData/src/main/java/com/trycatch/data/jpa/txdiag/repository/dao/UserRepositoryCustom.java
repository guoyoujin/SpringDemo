package com.trycatch.data.jpa.txdiag.repository.dao;

import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("com.trycatch.data.jpa.txdiag.repository.dao.UserRepositoryCustom")
public interface UserRepositoryCustom {
    List<UserEntity> findAll();
    UserEntity find(Long id);
    UserEntity findTest(Long id);
}
