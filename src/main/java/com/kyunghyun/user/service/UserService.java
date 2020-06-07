package com.kyunghyun.user.service;

import com.kyunghyun.user.dto.UserDto;
import com.kyunghyun.user.entity.User;
import com.kyunghyun.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private static final ModelMapper modelMapper = new ModelMapper();

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto userInfo(Long userNo){
        return modelMapper.map(userRepository.getOne(userNo), UserDto.class);
    }

    public void userCreate(UserDto userDto){
        userRepository.save(modelMapper.map(userDto , User.class ));
    }
}
