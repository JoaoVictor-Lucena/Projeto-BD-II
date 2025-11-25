package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.model.Ingrediente;
import com.example.restaurantsystem.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping
    public Ingrediente salvar(@RequestBody Ingrediente ingrediente){
        return ingredienteService.salvar(ingrediente);
    }

    @GetMapping
    public List<Ingrediente> listarTodos(){
        return ingredienteService.listarTodos();
    }
}
