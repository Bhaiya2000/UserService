package com.hotelreviewsystem.userservice.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){
        super("Resource is not available with this given id : kindly create data in database");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
