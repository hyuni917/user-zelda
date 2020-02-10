package com.kyunghyun.user.controller.v1.info;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/v1/info")
public class UserInfoController {

    @GetMapping(value = "/{seq}")
    public long userInfo(@PathVariable("seq") long seq){
        return seq;
    }
}
