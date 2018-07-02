package com.trycatch.data.jpa.txhims.service.impl;

import com.trycatch.data.jpa.txhims.repository.UserRepository;
import com.trycatch.data.jpa.txhims.repository.dao.impl.UserRepositoryImpl;
import com.trycatch.data.jpa.txhims.service.UserService;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("com.trycatch.data.jpa.txhims.service.impl.UserServiceImpl")
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Autowired
    @Qualifier(value="com.trycatch.data.jpa.txhims.repository.UserRepository")
    private UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        logger.info("txhims UserServiceImpl  findAll  =======================");
        return this.userRepository.findAll();
    }

    @Override
    public UserEntity find(Long id){
        logger.info("txhims UserServiceImpl  find  =======================");
        return this.userRepository.find(id);
    }

    @Override
    public UserEntity findTest(Long id){
        logger.info("txhims UserServiceImpl  findTest  =======================");
        return this.userRepository.findTest(id);
    }
}
