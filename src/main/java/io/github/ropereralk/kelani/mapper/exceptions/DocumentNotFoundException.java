package io.github.ropereralk.kelani.mapper.exceptions;

import org.springframework.http.HttpStatus;

public class DocumentNotFoundException extends RuntimeException {
    public DocumentNotFoundException(HttpStatus httpStatus ,String message){
        super(message);
    }
}
