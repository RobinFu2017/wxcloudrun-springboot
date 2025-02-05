package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * index控制器
 */
@Controller

public class IndexController {

    /**
     * 主页页面
     *
     * @return API response html
     */
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }


    @GetMapping(value = "/health")
    public ApiResponse health() {
        return ApiResponse.ok("Hi , I'm robin's program. ");
    }


}
