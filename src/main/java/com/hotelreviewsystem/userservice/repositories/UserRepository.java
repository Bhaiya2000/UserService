package com.hotelreviewsystem.userservice.repositories;

import com.hotelreviewsystem.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,String> {

    Optional <User> findByEmail(String email);

    Optional<List<User>> findByFirstName(String firstName);

    Optional<List<User>> findByLastName(String lastName);

   Optional<List<User>> findByPhoneNumber(String phoneNumber);

   Optional<List<User>> findByCity(String city);

   Optional<List<User>> findByState(String state);

    Optional<List<User>> findByCountry(String country);

   Optional<List<User>> findByAddress(String address);

//   Optional<List<User>> findByZipCode(Long zipCode);





}
