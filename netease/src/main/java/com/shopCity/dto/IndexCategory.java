package com.shopCity.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 首页推荐栏
 */
@ApiModel(value = "IndexCategory")
@Data
public class IndexCategory {

    private String id;

    private String name;

}
