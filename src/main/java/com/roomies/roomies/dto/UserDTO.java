package com.roomies.roomies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    public String username;
    public String password;
    public String confirmpassword;
}
