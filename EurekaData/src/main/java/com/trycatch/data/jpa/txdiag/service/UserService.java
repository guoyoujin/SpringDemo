package com.trycatch.data.jpa.txdiag.service;



import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

   List<UserEntity> findAll();
   UserEntity find(Long id);
   UserEntity findTest(Long id);
}
