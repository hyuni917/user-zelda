package com.kyunghyun.user.controller.v1.internal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/internal/user")
public class InternalUserController {

    @GetMapping(value = "/list")
    public String internalUserList(){
        return null;
    }
}
