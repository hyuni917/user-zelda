package com.kyunghyun.user.repository;

import com.kyunghyun.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;

@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userInfoRepository;

    @Test
    public void testUserInfoRepository(){

        //User user = User.builder().id("test").name("테스트").status("0").create_date(new Date()).update_date(new Date()).build();
        //System.out.println(user);
        //userInfoRepository.save(user);
        //List<UserInfo> userInfoList = userInfoRepository.findAll();
    }

}
