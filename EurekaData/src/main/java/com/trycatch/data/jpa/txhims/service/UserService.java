package com.trycatch.data.jpa.txhims.service;


import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("com.trycatch.data.jpa.txhims.service.UserService")
public interface UserService {
   List<UserEntity> findAll();
   UserEntity find(Long id);
   UserEntity findTest(Long id);
}
