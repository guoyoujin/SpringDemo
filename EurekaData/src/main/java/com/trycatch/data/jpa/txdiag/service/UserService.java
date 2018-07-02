package com.trycatch.data.jpa.txdiag.service;


import com.trycatch.data.jpa.base.BaseService;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.springframework.stereotype.Component;
@Component("com.trycatch.data.jpa.txdiag.service.UserService")
public interface UserService extends BaseService<UserEntity,Long> {
   UserEntity findTest(Long id);
}
