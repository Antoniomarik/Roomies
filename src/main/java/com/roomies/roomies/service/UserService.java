package com.roomies.roomies.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.roomies.roomies.dto.UserDTO;
import com.roomies.roomies.entity.User;
import com.roomies.roomies.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    UserRepository userRepository;

    private final ModelMapper modelMapper;
    //private final PasswordEncoder passwordEncoder;

    public User dtoToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO,User.class);
    }

    public UserDTO entityToDto(User user){return modelMapper.map(user,UserDTO.class);}

    public void saveUser(UserDTO userDTO){
        //userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user = dtoToEntity(userDTO);

        userRepository.save(user);
    }

    public List<UserDTO> getAllUsers(){
        List<User> list = userRepository.findAll();

        List<UserDTO> userList = list.stream().map(this::entityToDto).collect(Collectors.toList());


        return userList;
    }


}
