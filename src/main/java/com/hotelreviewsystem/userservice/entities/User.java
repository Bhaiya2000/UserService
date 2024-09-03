package com.hotelreviewsystem.userservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "userservicetable")
public class User {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

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
