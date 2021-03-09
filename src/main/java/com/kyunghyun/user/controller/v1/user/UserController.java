package com.kyunghyun.user.controller.v1.user;

import com.kyunghyun.user.dto.UserDto;
import com.kyunghyun.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/{userNo}")
    public ResponseEntity<UserDto> userInfo(@PathVariable("userNo") long userNo){
        return new ResponseEntity<>(userService.userInfo(userNo), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity userCreate(@Valid UserDto userDto){
        userService.userCreate(userDto);
        return new ResponseEntity("CREATED", HttpStatus.CREATED);
    }

    @PutMapping(value = "/{userNo}")
    public ResponseEntity userModify(@PathVariable("userNo") long userNo, @Valid UserDto userDto){
        return new ResponseEntity("OK", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{userNo}")
    public ResponseEntity userDelete(@PathVariable("userNo") long userNo){
        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
