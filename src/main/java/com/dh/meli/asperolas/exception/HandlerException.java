package com.dh.meli.asperolas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

public class HandlerException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerNotFoundException(NotFoundException e){
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("Joia não existente!")
                .message(e.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();
        return new ResponseEntity(exceptionDetails, HttpStatus.NOT_FOUND);
    }
}
