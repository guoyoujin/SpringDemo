package com.trycatch.service.client.controller.api.txdiag;


import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import com.trycatch.service.client.controller.api.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mapstruct.Mapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController("com.trycatch.service.client.controller.api.txdiag.HysDrugInfoController")
@RequestMapping(value = "/api/txdiag/hys_drug_infos")
@Api(value = "用户列表", description = "用户列表")
public class HysDrugInfoController extends BaseTxdiagController{
    private final static Logger logger = LoggerFactory.getLogger(HysDrugInfoController.class);

    @ApiOperation(value = "药品列表")
    @RequestMapping(value="",method = {RequestMethod.GET})
    public ApiResult<List<HysDrugInfoEntity>> List() {
        logger.info("====HysDrugInfoController===List===");
        return ResultGenerator.genSuccessResult(hysDrugInfoService.findAll());
    }

    @ApiOperation(value = "药品查询")
    @RequestMapping(value="/{id}",method = {RequestMethod.GET})
    public ApiResult<HysDrugInfoEntity> find(@PathVariable(name="id") Long id) {
        logger.info("====HysDrugInfoController===List===");
        return ResultGenerator.genSuccessResult(hysDrugInfoService.find(id));
    }


    @ApiOperation(value = "药品查询")
    @RequestMapping(value="",method = {RequestMethod.POST})
    public ApiResult<HysDrugInfoEntity> create(HysDrugInfoEntity map) {
        logger.debug("====HysDrugInfoController===List===,{}",map);
        return ResultGenerator.genSuccessResult(hysDrugInfoService.find(0L));
    }

}
