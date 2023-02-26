package com.example.katamodule.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(){
        super("No se pudo encontrar ningun categories");
    }
    public CategoryNotFoundException(Long id){
        super("No se puede encontrar la Category con la ID: " + id);
    }
}
