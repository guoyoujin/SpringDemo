package com.trycatch.data.jpa.txhims.service;


import com.trycatch.eurekabean.data.txhims.entity.UserEntity;

import java.util.List;

public interface UserService {

   List<UserEntity> findAll();
   UserEntity find(Long id);
   UserEntity findTest(Long id);
}
