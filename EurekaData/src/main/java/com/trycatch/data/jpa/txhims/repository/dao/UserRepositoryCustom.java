package com.trycatch.data.jpa.txhims.repository.dao;


import com.trycatch.eurekabean.data.txhims.entity.UserTestEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("com.trycatch.data.jpa.txhims.repository.dao.UserRepositoryCustom")
public interface UserRepositoryCustom<T,ID>{
    List<UserTestEntity> findAll();
    UserTestEntity find(Long id);
    UserTestEntity findTest(Long id);
}
