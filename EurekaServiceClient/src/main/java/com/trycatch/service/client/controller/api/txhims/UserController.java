package com.trycatch.service.client.controller.api.txhims;


import com.trycatch.data.jpa.txhims.service.UserService;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import com.trycatch.service.client.controller.api.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController("com.trycatch.service.client.controller.api.txhims.UserController")
@RequestMapping(value = "/api/txhims/users")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Resource(name="com.trycatch.data.jpa.txhims.service.impl.UserServiceImpl")
    private UserService userService;

    @RequestMapping("/list")
    public ApiResult<List<UserEntity>> List() {
        logger.info("====UserController===List===");
        return new ApiResult<>(Constant.MSG_SUCCSS,Constant.FLAG_SUCCESS, userService.findAll(),Constant.REQ_SUCCESS);
    }
}
