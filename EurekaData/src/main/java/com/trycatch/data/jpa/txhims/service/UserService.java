package com.trycatch.data.jpa.txhims.service;


import com.trycatch.eurekabean.data.txhims.entity.UserTestEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component("com.trycatch.data.jpa.txhims.service.UserService")
public interface UserService {
   List<UserTestEntity> findAll();
   UserTestEntity find(Long id);
   UserTestEntity findTest(Long id);
}
