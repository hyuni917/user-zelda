package com.kyunghyun.user.repository;

import com.kyunghyun.user.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserInfoRepositoryTests {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    public void testUserInfoRepository(){
        UserInfo userInfo = UserInfo.builder().id("test").name("테스트").status("0").create_date(new Date()).update_date(new Date()).build();
        System.out.println(userInfo);
        userInfoRepository.save(userInfo);
        //List<UserInfo> userInfoList = userInfoRepository.findAll();

    }

}
