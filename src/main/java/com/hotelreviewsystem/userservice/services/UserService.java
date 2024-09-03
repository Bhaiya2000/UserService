package com.hotelreviewsystem.userservice.services;
import com.hotelreviewsystem.userservice.entities.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public interface UserService {
     User save(User user);

     User findById(String id);

     User findByEmail(String email);

     Optional<List<User>> findByFirstName(String firstName);

     Optional<List<User>> findByLastName(String lastName);

     Optional<List<User>> findByPhoneNumber(String phoneNumber);

     Optional<List<User>> findByCity(String city);

     Optional<List<User>> findByState(String state);

     Optional<List<User>> findByCountry(String country);

     Optional<List<User>> findByAddress(String address);

     Optional<List<User>> findAll();

     User update(User user, String id);

}
