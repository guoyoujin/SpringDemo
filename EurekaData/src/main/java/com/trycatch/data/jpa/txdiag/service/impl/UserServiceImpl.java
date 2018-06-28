package com.trycatch.data.jpa.txdiag.service.impl;

import com.trycatch.data.jpa.txdiag.repository.UserRepository;
import com.trycatch.data.jpa.txdiag.service.UserService;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("com.trycatch.data.jpa.txdiag.service.impl.UserServiceImpl")
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    @Resource(name="com.trycatch.data.jpa.txdiag.repository.UserRepository")
    private UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        logger.info("txdiag UserServiceImpl  findAll()");
        return this.userRepository.findAll();
    }

    @Override
    public UserEntity find(Long id){
        logger.info("txdiag UserServiceImpl  find()");
        return this.userRepository.find(id);
    }

    @Override
    public UserEntity findTest(Long id){
        logger.info("======== txdiag UserServiceImpl  findTest()");
        return this.userRepository.findTest(id);
    }
}
