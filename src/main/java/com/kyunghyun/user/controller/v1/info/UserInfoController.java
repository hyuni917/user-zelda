package com.kyunghyun.user.controller.v1.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/v1/info")
public class UserInfoController {

    @GetMapping
    public String userInfo(){

        return "kyunghyun";
    }


}
