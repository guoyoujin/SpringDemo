package com.trycatch.data.jpa.txhims.service;


import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("com.trycatch.data.jpa.txhims.service.UserService")
public interface UserService {
   List<UserEntity> findAll();
   UserEntity find(Long id);
   UserEntity findTest(Long id);
}
