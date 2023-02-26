package com.example.katamodule.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends RuntimeException{

    public BeerNotFoundException(){
        super("No se pudo encontrar ningun beers");
    }
    public BeerNotFoundException(Long id){
        super("No se puede encontrar el beer con la ID: " + id);
    }
}
