package com.kyunghyun.user.controller.v1.user;

import com.kyunghyun.user.dto.UserResDto;
import com.kyunghyun.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public UserResDto userInfo(@PathVariable("id") long id){
        return userService.userInfo(id);
    }
}
