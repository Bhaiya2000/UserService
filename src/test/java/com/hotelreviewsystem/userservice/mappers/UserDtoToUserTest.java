package com.hotelreviewsystem.userservice.mappers;

import com.hotelreviewsystem.userservice.dtos.UserDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserDtoToUserTest {

    @InjectMocks
    private UserDtoToUser userDtoToUser;

    @Test
   public void getUserDTO(@Mock UserDTO UserDTO) {
        UserDtoToUser.getUserDTO(UserDTO);
    }
}