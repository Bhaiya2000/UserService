package com.hotelreviewsystem.userservice.services.impl;

import com.hotelreviewsystem.userservice.entities.User;
import com.hotelreviewsystem.userservice.repositories.UserRepository;
import jakarta.persistence.Entity;
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
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Mock
    private UserRepository userRepository;

    @Test
    public void save() {
        User user = new User();
        user.setId("1");
        Mockito.when(userRepository.save(user)).thenReturn(user);
        userServiceImpl.save(user);
    }

    @Test
    public void findById() {
        Optional<User> user = Optional.of(new User());
        Mockito.when(userRepository.findById(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findById("2");
    }

    @Test
    public void findByIdCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findById("2");
        });
    }

    @Test
    public void findByEmail() {
        Optional<User> user = Optional.of(new User());
        Mockito.when(userRepository.findByEmail(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findByEmail("findByEmail");
    }

    @Test
    public void findByEmailCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByEmail("findByEmail");
        });
    }

    @Test
    public void findByFirstName() {
        Optional<List<User>> user = Optional.of(new ArrayList<>());
        Mockito.when(userRepository.findByFirstName(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findByFirstName("findByFirstName");
    }

    @Test
    public void findByFirstNameCoveringIfCondition() {
//        Optional<List<User>> user = Optional.of(new ArrayList<>());
//        Mockito.when(userRepository.findByFirstName(Mockito.anyString())).thenReturn(user);
//        userServiceImpl.findByFirstName("findByFirstName");
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByFirstName("findByFirstName");
        });
    }

    @Test
    public void findByLastName() {
        Optional<List<User>> user = Optional.of(new ArrayList<>());
        Mockito.when(userRepository.findByLastName(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findByLastName("findByLastName");
    }

    @Test
    public void findByLastNameCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByLastName("findByLastName");
        });
    }



    @Test
    public void findByPhoneNumber() {
     Optional<List<User>> user = Optional.of(new ArrayList<>());
     Mockito.when(userRepository.findByPhoneNumber(Mockito.anyString())).thenReturn(user);
     userServiceImpl.findByPhoneNumber("findByPhoneNumber");
    }

    @Test
    public void findByPhoneNumberCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByPhoneNumber("findByPhoneNumber");
        });
    }

    @Test
    public void findByCity() {
      Optional<List<User>> user = Optional.of(new ArrayList<>());
      Mockito.when(userRepository.findByCity(Mockito.anyString())).thenReturn(user);
      userServiceImpl.findByCity("findByCity");
    }

    @Test
    public void findByCityCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByCity("findByCity");
        });
    }

    @Test
    public void findByState() {
        Optional<List<User>> user = Optional.of(new ArrayList<>());
        Mockito.when(userRepository.findByState(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findByState("findByState");
    }

    @Test
    public void findByStateCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByState("findByState");
        });
    }

    @Test
    public void findByCountry() {
        Optional<List<User>> user = Optional.of(new ArrayList<>());
        Mockito.when(userRepository.findByCountry(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findByCountry("findByCountry");
    }

    @Test
    public void findByCountryCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByCountry("findByCountry");
        });
    }

    @Test
    public void findByAddress() {
        Optional<List<User>> user = Optional.of(new ArrayList<>());
        Mockito.when(userRepository.findByAddress(Mockito.anyString())).thenReturn(user);
        userServiceImpl.findByAddress("findByAddress");
    }

    @Test
    public void findByAddressCoveringIfCondition() {
        User user = new User();
        user.setId("1");
        assertThrows(Exception.class, ()->{
            userServiceImpl.findByAddress("findByAddress");
        });
    }

    @Test
    public void findAll() {
    Optional<List<User>> user = Optional.of(new ArrayList<>());
    userServiceImpl.findAll();
    }

//    @Test
    public void update() {
        String id  = "update";
       User user = new User();
       user.setId("1");
       Mockito.when(userRepository.findById(Mockito.anyString()).get()).thenReturn(user);
       Mockito.when(userRepository.save(user)).thenReturn(user);
       userServiceImpl.update(user,id);
    }
}