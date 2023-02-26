package com.example.katamodule.controller;

import com.example.katamodule.error.BeerNotFoundException;
import com.example.katamodule.error.BreweryNotFoundException;
import com.example.katamodule.model.Brewery;
import com.example.katamodule.repos.BreweryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BreweryController {
    private final BreweryRepository breweryRepository;
    @GetMapping("/breweries")
    public List<Brewery> obtenerTodos() {
        List<Brewery> result = breweryRepository.findAll();
        if(result.isEmpty()){
            throw new BreweryNotFoundException();
        }
        return result;
    }
    @GetMapping("/brewery/{id}")
    public Brewery obtenerUno(@PathVariable Long id) {
        return breweryRepository.findById(id).orElseThrow(() -> new BreweryNotFoundException(id));
    }
}
