package com.example.katamodule.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StyleNotFoundException extends RuntimeException{
    public StyleNotFoundException(){
        super("No se pudo encontrar ningun Styles");
    }
    public StyleNotFoundException(Long id){
        super("No se puede encontrar el Style con la ID: " + id);
    }
}
