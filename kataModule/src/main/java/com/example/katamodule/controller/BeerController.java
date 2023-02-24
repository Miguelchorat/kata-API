package com.example.katamodule.controller;
import com.example.katamodule.model.Beer;
import com.example.katamodule.repos.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BeerController {
    private final BeerRepository beerRepository;

    @GetMapping("/beers")
    public List<Beer> obtenerTodos() {
        return beerRepository.findAll();
    }

    @GetMapping("/beer/{id}")
    public Beer obtenerUno(@PathVariable Long id) {
        return beerRepository.findById(id).orElse(null);
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
            return null;
        }
    }

    @DeleteMapping("/beer/{id}")
    public Beer deleteBeer(@PathVariable Long id) {
        if (beerRepository.existsById(id)) {
            Beer result = beerRepository.findById(id).get();
            beerRepository.deleteById(id);
            return result;
        } else
            return null;
    }
}
