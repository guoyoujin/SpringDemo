package com.trycatch.service.client.controller.api.txdiag;

import com.trycatch.data.jpa.txdiag.service.UserService;
import com.trycatch.service.client.controller.api.BaseApiController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class BaseTxdiagController extends BaseApiController{
    private final static Logger logger = LoggerFactory.getLogger(BaseTxdiagController.class);
    @Autowired
    @Resource(name="com.trycatch.data.jpa.txdiag.service.impl.UserServiceImpl")
    public UserService userService;
}
