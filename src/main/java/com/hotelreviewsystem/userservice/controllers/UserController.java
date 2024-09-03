package com.hotelreviewsystem.userservice.controllers;

import com.hotelreviewsystem.userservice.dtos.UserDTO;
import com.hotelreviewsystem.userservice.entities.User;
import com.hotelreviewsystem.userservice.exceptions.ResourceNotFoundException;
import com.hotelreviewsystem.userservice.mappers.UserDtoToUser;
import com.hotelreviewsystem.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private  UserService userService;


    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody UserDTO userDTO) {

         User user1 = UserDtoToUser.getUserDTO(userDTO);
         User user2 = userService.save(user1);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<User> findUserById(@RequestParam("id") String id) throws ResourceNotFoundException {
        System.out.println(id.getClass());
        User user1 = userService.findById(id);
        return new ResponseEntity<>(user1,HttpStatus.OK);
    }


    @GetMapping("/email/{email}")
    public  ResponseEntity<User> findByEmail(@PathVariable String email) throws ResourceNotFoundException {
        User user1 = userService.findByEmail(email);
        return new ResponseEntity<>(user1,HttpStatus.OK);
    }


    @GetMapping("/firstName/{firstName}")
    public ResponseEntity<Optional<List<User>>> findByFirstName(@PathVariable String firstName)
            throws ResourceNotFoundException {
        Optional<List<User>> user1 = userService.findByFirstName(firstName);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/lastName/{lastName}")
    public ResponseEntity<Optional<List<User>>> findByLastName(@PathVariable String lastName)
            throws ResourceNotFoundException {
        Optional<List<User>> user1 = userService.findByLastName(lastName);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/phoneNumber/{phoneNumber}")
    public ResponseEntity<Optional<List<User>>> findByPhoneNumber(@PathVariable  String phoneNumber)
    {
        Optional<List<User>> user1 = userService.findByPhoneNumber(phoneNumber);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/city/{city}")
    public ResponseEntity<Optional<List<User>>> findByCity(@PathVariable String city){
        Optional<List<User>> user1 = userService.findByCity(city);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/state/{state}")
    public ResponseEntity<Optional<List<User>>> findByState(@PathVariable String state){
        Optional<List<User>> user1 = userService.findByState(state);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/country/{country}")
    public ResponseEntity<Optional<List<User>>> findByCountry(@PathVariable String country){
        Optional<List<User>> user1 = userService.findByCountry(country);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/address/{address}")
    public ResponseEntity<Optional<List<User>>> findByAddress(@PathVariable String address){
        Optional<List<User>> user1 = userService.findByAddress(address);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }


    @GetMapping("/getUsers")
    public ResponseEntity<Optional<List<User>>> findAll(){
        Optional<List<User>> user1 = userService.findAll();
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }

    @PutMapping("/updateUserWithId/{updateUserWithId}")
    public ResponseEntity<User> updateUser(@RequestBody UserDTO userDTO, @PathVariable("updateUserWithId")  String id)
            throws ResourceNotFoundException {
        User user1 = UserDtoToUser.getUserDTO(userDTO);
        userService.update(user1, id);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }



}
