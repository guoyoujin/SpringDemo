package com.trycatch.service.client.controller.api.txdiag;


import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import com.trycatch.service.client.controller.api.Constant;
import com.trycatch.service.client.controller.api.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("com.trycatch.service.client.controller.api.txdiag.UserController")
@RequestMapping(value = "/api/txdiag/users")
public class UserController extends BaseTxdiagController{
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/list")
    public ApiResult<List<UserEntity>> List() {
        logger.info("====UserController===List===");
        return ResultGenerator.genSuccessResult(userService.findAll());
    }

    @RequestMapping("/{id}")
    public ApiResult<UserEntity> find(@PathVariable(name="id") Long id) {
        logger.info("====UserController===List===");
        return ResultGenerator.genSuccessResult(userService.find(id));
    }

}
