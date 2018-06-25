package com.trycatch.data.jpa.txdiag.service;



import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;

import java.util.List;

public interface UserService {

   List<UserEntity> findAll();
   UserEntity find(Long id);
   UserEntity findTest(Long id);
}
