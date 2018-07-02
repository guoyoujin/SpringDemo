package com.trycatch.data.jpa.txhims.service;


import com.trycatch.data.jpa.txdiag.service.BaseService;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component("com.trycatch.data.jpa.txhims.service.UserService")
public interface UserService extends BaseService<UserEntity,Long> {
   UserEntity findTest(Long id);
}
