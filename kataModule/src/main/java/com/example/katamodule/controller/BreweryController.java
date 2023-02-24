package com.example.katamodule.controller;

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
        return breweryRepository.findAll();
    }

    @GetMapping("/brewery/{id}")
    public Brewery obtenerUno(@PathVariable Long id) {
        return breweryRepository.findById(id).orElse(null);
    }

    @PostMapping("/breweries")
    public Brewery newBrewery(@RequestBody Brewery newBrewery) {
        return breweryRepository.save(newBrewery);
    }
}
