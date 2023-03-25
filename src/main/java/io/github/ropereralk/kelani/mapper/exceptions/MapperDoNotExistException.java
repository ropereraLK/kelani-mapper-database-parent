package io.github.ropereralk.kelani.mapper.exceptions;

public class MapperDoNotExistException extends RuntimeException{
    public MapperDoNotExistException(String exceptionMessage){
        super(exceptionMessage);
    }
}
