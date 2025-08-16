package tfg.proy.api.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import tfg.proy.api.controller.SecurityCreationException;
import tfg.proy.api.controller.SecurityModificationException;

@RestControllerAdvice
public class ControllerAdvice {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SecurityCreationException.class)
    public void ModificationControl(){
        
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SecurityModificationException.class)
    public void CreationControl(){
        
    }
}
