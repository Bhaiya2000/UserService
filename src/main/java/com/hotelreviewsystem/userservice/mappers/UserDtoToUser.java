package com.hotelreviewsystem.userservice.mappers;

import com.hotelreviewsystem.userservice.dtos.UserDTO;
import com.hotelreviewsystem.userservice.entities.User;

public class UserDtoToUser {

    public static User getUserDTO(UserDTO UserDTO ) {
        User user = new User();
        user.setFirstName(UserDTO.getFirstName());
        user.setLastName(UserDTO.getLastName());
        user.setEmail(UserDTO.getEmail());
        user.setPassword(UserDTO.getPassword());
        user.setAddress(UserDTO.getAddress());
        user.setPhoneNumber(UserDTO.getPhoneNumber());
        user.setCity(UserDTO.getCity());
        user.setState(UserDTO.getState());
        user.setCountry(UserDTO.getCountry());
        user.setZip(UserDTO.getZip());
        return user;
    }

}
