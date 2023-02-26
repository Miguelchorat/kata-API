package com.example.katamodule.controller;


import com.example.katamodule.error.BeerNotFoundException;
import com.example.katamodule.error.BreweryNotFoundException;
import com.example.katamodule.error.StyleNotFoundException;
import com.example.katamodule.model.Style;
import com.example.katamodule.repos.StyleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StyleController {

    private final StyleRepository styleRepository;

    @GetMapping("/styles")
    public List<Style> obtenerTodos() {
        List<Style> result = styleRepository.findAll();
        if(result.isEmpty()){
            throw new StyleNotFoundException();
        }
        return result;
    }

    @GetMapping("/style/{id}")
    public Style obtenerUno(@PathVariable Long id) {
        return styleRepository.findById(id).orElseThrow(() -> new StyleNotFoundException(id));
    }
}
