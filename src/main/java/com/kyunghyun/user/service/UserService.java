package com.kyunghyun.user.service;


import com.kyunghyun.user.dto.UserResDto;
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

    public UserResDto userInfo(Long id){
       return modelMapper.map(userRepository.getOne(id),UserResDto.class);
    }

}
