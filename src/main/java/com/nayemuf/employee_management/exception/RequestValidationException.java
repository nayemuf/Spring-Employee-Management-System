package com.nayemuf.employee_management.exception;

public class RequestValidationException extends RuntimeException{
    public RequestValidationException(String message){
        super(message);
    }
}
