package com.example.katamodule.controller;
import com.example.katamodule.error.ApiError;
import com.example.katamodule.error.BeerNotFoundException;
import com.example.katamodule.model.Beer;
import com.example.katamodule.repos.BeerRepository;
import com.fasterxml.jackson.databind.JsonMappingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BeerController {
    private final BeerRepository beerRepository;

    @GetMapping("/beers")
    public List<Beer> obtenerTodos() {
        List<Beer> result =  beerRepository.findAll();

        if(result.isEmpty()){
            throw new BeerNotFoundException();
        }

        return result;
    }

    @GetMapping("/beer/{id}")
    public Beer obtenerUno(@PathVariable Long id) {
        return beerRepository.findById(id).orElseThrow(() -> new BeerNotFoundException(id));
    }
    @PostMapping("/beer")
    public Beer newBeer(@RequestBody Beer newBeer){
        return beerRepository.save(newBeer);
    }

    @PutMapping("/beer/{id}")
    public Beer updateBeer(@RequestBody Beer updateBeer, @PathVariable Long id){
        if(beerRepository.existsById(id)){
            updateBeer.setId(id);
            return beerRepository.save(updateBeer);
        }
        else{
            throw new BeerNotFoundException(id);
        }
    }

    @DeleteMapping("/beer/{id}")
    public Beer deleteBeer(@PathVariable Long id) {
        if (beerRepository.existsById(id)) {
            Beer result = beerRepository.findById(id).get();
            beerRepository.deleteById(id);
            return result;
        } else
            throw new BeerNotFoundException(id);
    }

}
