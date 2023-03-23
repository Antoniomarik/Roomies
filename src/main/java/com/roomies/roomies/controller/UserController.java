package com.roomies.roomies.controller;

import com.roomies.roomies.dto.UserDTO;
import com.roomies.roomies.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@Data
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/show")
    public String test(Model model){
        List<UserDTO> userDTOList = userService.getAllUsers();

        model.addAttribute("userList",userDTOList);

        return "dusers";
    }
}
