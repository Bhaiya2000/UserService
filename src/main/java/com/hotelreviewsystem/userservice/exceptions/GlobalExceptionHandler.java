package com.hotelreviewsystem.userservice.exceptions;


import com.hotelreviewsystem.userservice.payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException)
    {
            String message = resourceNotFoundException.getMessage();
        ApiResponse apiResponse =  ApiResponse.builder()
                                              .message(message)
                                               .success(true)
                                                 .httpStatus(HttpStatus.NOT_FOUND)
                                                    .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
