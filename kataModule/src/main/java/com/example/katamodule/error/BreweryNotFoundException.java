package com.example.katamodule.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BreweryNotFoundException extends RuntimeException{

    public BreweryNotFoundException(){
        super("No se pudo encontrar ningun breweries");
    }
    public BreweryNotFoundException(Long id){
        super("No se puede encontrar la brewery con la ID: " + id);
    }
}
