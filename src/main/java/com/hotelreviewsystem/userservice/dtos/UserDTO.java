package com.hotelreviewsystem.userservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phoneNumber;

    private String address;

    private String city;

    private String state;

    private String country;

    private String zip;

}
