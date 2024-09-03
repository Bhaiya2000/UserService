package com.hotelreviewsystem.userservice.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserTest {

    @InjectMocks
    private User user;


    @Test
   public void getId() {
        user.getId();
    }

    @Test
    public void getFirstName() {
        user.getFirstName();
    }

    @Test
    void getLastName() {
        user.getLastName();
    }

    @Test
    public  void getEmail() {
        user.getEmail();
    }

    @Test
    public void getPassword() {
        user.getPassword();
    }

    @Test
    public  void getPhoneNumber() {
        user.getPhoneNumber();
    }

    public @Test
    void getAddress() {
        user.getAddress();
    }

    @Test
    public  void getCity() {
        user.getCity();
    }

    @Test
    public void getState() {
        user.getState();
    }

    @Test
    public void getCountry() {
        user.getCountry();
    }

    @Test
    public void getZip() {
        user.getZip();
    }

    @Test
    public void setId() {
        user.setId("1");
    }

    @Test
    public void setFirstName() {
        user.setFirstName("John");
    }

    @Test
    public  void setLastName() {
        user.setLastName("Doe");
    }

    @Test
    public void setEmail() {
        user.setEmail("john@doe.com");
    }

    @Test
    public void setPassword() {
        user.setPassword("password");
    }

    @Test
    public void setPhoneNumber() {
        user.setPhoneNumber("123456789");
    }

    @Test
    public  void setAddress() {
        user.setAddress("address");
    }

    @Test
    public void setCity() {
        user.setCity("city");
    }

    @Test
    public  void setState() {
        user.setState("state");
    }

    @Test
    public void setCountry() {
        user.setCountry("country");
    }

    @Test
    public void setZip() {
        user.setZip("zip");
    }
}