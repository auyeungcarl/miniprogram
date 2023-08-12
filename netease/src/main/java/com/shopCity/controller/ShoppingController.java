package com.shopCity.controller;

import com.macro.shop.common.api.CommonResult;
import com.shopCity.dto.IndexCategory;
import com.shopCity.service.ShoppingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.shopCity.dto.PmsBrand;
import com.shopCity.dto.PmsBrandVO;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试controller
 */
@Api(value = "demo", description = "demo详情")
@Controller
@RequestMapping(path = "/netease")
public class ShoppingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingController.class);

    @Autowired
    ShoppingService shoppingService;

    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "/index/categoryList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List> getIndexCategoryList() {
        List<IndexCategory> categories = shoppingService.queryIndexCategoryList();
        return CommonResult.success(categories);
    }

//    @ApiOperation(value = "获取全部品牌列表")
//    @RequestMapping(value = "/brand/listAll", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<List> getBrandList() {
//        PmsBrand pmsBrand = new PmsBrand();
//        pmsBrand.setId(111L);
//        List list = new ArrayList();
//        list.add(pmsBrand);
//        return CommonResult.success(list);
//    }
//
//    @ApiOperation(value = "添加品牌")
//    @RequestMapping(value = "/brand/create", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult createBrand(@Validated @RequestBody PmsBrandVO pmsBrand, BindingResult result) {
//        if (result.hasErrors()) {
//            return CommonResult.validateFailed(result.getFieldError().getDefaultMessage());
//        }
//        CommonResult commonResult;
//        int count = 1;
//        if (count == 1) {
//            commonResult = CommonResult.success(pmsBrand);
//            LOGGER.debug("createBrand success:{}", pmsBrand);
//        } else {
//            commonResult = CommonResult.failed("操作失败");
//            LOGGER.debug("createBrand failed:{}", pmsBrand);
//        }
//        return commonResult;
//    }

}
