package com.trycatch.service.client.controller.api.txhims;


import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import com.trycatch.service.client.controller.api.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("com.trycatch.service.client.controller.api.txhims.UserController")
@RequestMapping(value = "/api/txhims/users")
public class UserController extends BaseTxhimsController{
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/list")
    public ApiResult<List<UserEntity>> List() {
        logger.info("====UserController===List===");
        return new ApiResult<>(Constant.MSG_SUCCSS,Constant.FLAG_SUCCESS, userService.findAll(),Constant.REQ_SUCCESS);
    }

    @RequestMapping("/{id}")
    public ApiResult<UserEntity> find(@PathVariable(name="id") Long id) {
        logger.info("====UserController===List===");
        return new ApiResult(Constant.MSG_SUCCSS,Constant.FLAG_SUCCESS, userService.find(id),Constant.REQ_SUCCESS);
    }
}
