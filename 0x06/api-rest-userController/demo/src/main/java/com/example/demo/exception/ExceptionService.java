package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler(UserIdException.class)
    public ResponseEntity<UserErrorResponse> handleException(UserIdException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setMessage(err.getMessage());
        return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNameException.class)
    public ResponseEntity<UserErrorResponse> handleException(UserNameException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setMessage(err.getMessage());
        return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CPFException.class)
    public ResponseEntity<UserErrorResponse> handleException(CPFException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setMessage(err.getMessage());
        return new ResponseEntity<>(uer, HttpStatus.BAD_REQUEST);
    }
}
