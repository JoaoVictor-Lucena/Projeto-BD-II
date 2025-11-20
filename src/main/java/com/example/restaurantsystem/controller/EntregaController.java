package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.model.Entrega;
import com.example.restaurantsystem.service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entrega")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @PostMapping
    public Entrega salvar(@RequestBody Entrega entrega){
        return entregaService.salvar(entrega);
    }

    @GetMapping
    public List<Entrega> listarTodos(){
        return entregaService.listarTodos();
    }
}
