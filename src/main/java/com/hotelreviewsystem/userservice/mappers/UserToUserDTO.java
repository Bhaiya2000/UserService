package com.hotelreviewsystem.userservice.mappers;

import com.hotelreviewsystem.userservice.dtos.UserDTO;
import com.hotelreviewsystem.userservice.entities.User;

public class UserToUserDTO {

    public static UserDTO fromUser(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setAddress(user.getAddress());
        userDTO.setCity(user.getCity());
        userDTO.setCountry(user.getCountry());
        userDTO.setState(user.getState());
        userDTO.setZip(user.getZip());
        return userDTO;
    }
}
