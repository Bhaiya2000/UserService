package com.hotelreviewsystem.userservice.controllers;

import com.hotelreviewsystem.userservice.dtos.UserDTO;
import com.hotelreviewsystem.userservice.entities.User;
import com.hotelreviewsystem.userservice.mappers.UserDtoToUser;
import com.hotelreviewsystem.userservice.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;


    @Test
   public void saveUser(@Mock UserDTO userDTO) {
        User user = new User();
        Mockito.when(userService.save(Mockito.any())).thenReturn(user);
        userController.saveUser(userDTO);
    }

    @Test
    public void findUserById() {
        User user = new User();
        Mockito.when(userService.findById(Mockito.anyString())).thenReturn(user);
        userController.findUserById("1");
    }

    @Test
    public  void findByEmail() {
        User user = new User();
        Mockito.when(userService.findByEmail(Mockito.anyString())).thenReturn(user);
        userController.findByEmail("anandshukladhruv@gmail.com");
    }

    @Test
   public void findByFirstName() {

        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByFirstName(Mockito.anyString())).thenReturn(users);
        userController.findByFirstName("anand");
    }

    @Test
   public void findByLastName() {
        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByLastName(Mockito.anyString())).thenReturn(users);
        userController.findByLastName("shukla");
    }

    @Test
   public void findByPhoneNumber() {
        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByPhoneNumber(Mockito.anyString())).thenReturn(users);
        userController.findByPhoneNumber("123456789");
    }

    @Test
   public void findByCity() {
        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByCity(Mockito.anyString())).thenReturn(users);
        userController.findByCity("San Francisco");
    }

    @Test
   public  void findByState() {
        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByState(Mockito.anyString())).thenReturn(users);
        userController.findByState("CA");
    }

    @Test
   public  void findByCountry() {
        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByCountry(Mockito.anyString())).thenReturn(users);
        userController.findByCountry("US");
    }

    @Test
   public  void findByAddress() {
        Optional<List<User>> users = Optional.of(new ArrayList<>());
        Mockito.when(userService.findByAddress(Mockito.anyString())).thenReturn(users);
        userController.findByAddress("San Francisco");
    }

    @Test
   public  void findAll() {
        Optional<List<User>> users = userService.findAll();
        userController.findAll();
    }

    @Test
   public void updateUser() {
        String id = "update";
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("update");
        User user = new User();
        Mockito.when(userService.update(Mockito.any(), Mockito.anyString())).thenReturn(user);
        userController.updateUser(userDTO, id);
    }
}