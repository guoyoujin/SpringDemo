package com.trycatch.service.client.controller.api.txdiag;


import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import com.trycatch.service.client.controller.api.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController("com.trycatch.service.client.controller.api.txdiag.UserController")
@RequestMapping(value = "/api/txdiag/users")
@Api(value = "用户列表", description = "用户列表")
public class UserController extends BaseTxdiagController{
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "用户列表")
    @RequestMapping(value="/list",method = {RequestMethod.GET})
    public ApiResult<List<UserEntity>> List() {
        logger.info("====UserController===List===");
        return ResultGenerator.genSuccessResult(userService.findAll());
    }

    @ApiOperation(value = "用户查询")
    @RequestMapping(value="/{id}",method = {RequestMethod.GET})
    public ApiResult<UserEntity> find(@PathVariable(name="id") Long id) {
        logger.info("====UserController===List===");
        return ResultGenerator.genSuccessResult(userService.find(id));
    }

}
