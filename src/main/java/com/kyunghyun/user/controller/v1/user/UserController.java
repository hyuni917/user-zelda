package com.kyunghyun.user.controller.v1.user;

import com.kyunghyun.user.dto.UserDto;
import com.kyunghyun.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{userNo}")
    public ResponseEntity<UserDto> userInfo(@PathVariable("userNo") long userNo){
        return new ResponseEntity<>(userService.userInfo(userNo), HttpStatus.OK);
    }
}