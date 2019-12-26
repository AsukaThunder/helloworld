package com.ford.helloworld.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName: HelloWorldController
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/12/25 下午 4:49
 **/
@Api(tags = "helloworld")
@RestController
public class HelloWorldController {

    @ApiOperation(value = "你好")
    @RequestMapping(value = "/helloworld")
    public String HelloWorld(){
        return "Hello World!";
    }
}
