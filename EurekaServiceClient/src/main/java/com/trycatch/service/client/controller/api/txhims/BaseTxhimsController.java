package com.trycatch.service.client.controller.api.txhims;

import com.trycatch.data.jpa.txhims.service.UserService;
import com.trycatch.service.client.controller.api.BaseApiController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class BaseTxhimsController extends BaseApiController{
    private final static Logger logger = LoggerFactory.getLogger(BaseTxhimsController.class);

    @Autowired
    @Resource(name="com.trycatch.data.jpa.txhims.service.impl.UserServiceImpl")
    public UserService userService;
}
