package com.hotelreviewsystem.userservice.services.impl;
import com.hotelreviewsystem.userservice.entities.User;
import com.hotelreviewsystem.userservice.exceptions.ResourceNotFoundException;
import com.hotelreviewsystem.userservice.repositories.UserRepository;
import com.hotelreviewsystem.userservice.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger  = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
      String randomUserId =   UUID.randomUUID().toString();
        user.setId(randomUserId);
        return   userRepository.save(user);
    }

    @Override
    public User findById(String id) throws ResourceNotFoundException{
            Optional<User> user = userRepository.findById(id);
            if(user.isEmpty())
            {
                throw new ResourceNotFoundException("User with given id is not found in server : "+ id);
            }
            return user.get();
    }

    @Override
    public User findByEmail(String email) throws ResourceNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("User with given email is not found in server : "+ email);
//            throw new ResourceNotFoundException();  // by throwing this kind of exception, it will call the GlobalExceptionhandler method
        }
        return user.get();
    }

    @Override
    public Optional<List<User>> findByFirstName(String firstName) {
        Optional<List<User>> user = userRepository.findByFirstName(firstName);
        if(user.isEmpty()){
            throw new ResourceNotFoundException("User with given first name is not found in server : "+ firstName);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findByLastName(String lastName) {
       Optional<List<User>> user = userRepository.findByLastName(lastName);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("User with given last name is not found in server : " + lastName);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findByPhoneNumber(String phoneNumber) {
        Optional<List<User>> user = userRepository.findByPhoneNumber(phoneNumber);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("User with given phone number is not found in server : " + phoneNumber);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findByCity(String city) {
        Optional<List<User>> user = userRepository.findByCity(city);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("User with given city is not found in server : " + city);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findByState(String state) {
        Optional<List<User>> user = userRepository.findByState(state);
        if(user.isEmpty()) {
            throw new ResourceNotFoundException("User with given state is not found in server : " + state);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findByCountry(String country) {
        Optional<List<User>> user = userRepository.findByCountry(country);
        if(user.isEmpty()) {
            throw new ResourceNotFoundException("User with given country is not found in server : " + country);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findByAddress(String address) {
        Optional<List<User>> user = userRepository.findByAddress(address);
        if(user.isEmpty()) {
            throw new ResourceNotFoundException("User with given address is not found in server : " + address);
        }
        return user;
    }

    @Override
    public Optional<List<User>> findAll() {
        Optional<List<User>> user = Optional.of(userRepository.findAll());
        return user;
    }

    @Override
    public User update(User user, String id) {
        User user1 = userRepository.findById(id).get();
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        user1.setPhoneNumber(user.getPhoneNumber());
        user1.setCity(user.getCity());
        user1.setState(user.getState());
        user1.setCountry(user.getCountry());
        user1.setAddress(user.getAddress());
         User user2 =  userRepository.save(user1);
        return user2;
    }
}
