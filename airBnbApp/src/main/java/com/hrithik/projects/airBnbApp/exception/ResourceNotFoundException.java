package com.hrithik.projects.airBnbApp.exception;

public class ResourceNotFoundException extends RuntimeException {

   public ResourceNotFoundException(String message){
        super(message);
    }
}
