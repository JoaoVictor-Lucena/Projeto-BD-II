package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.model.Prato;
import com.example.restaurantsystem.service.PratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pratos")
public class PratoController {

    @Autowired
    private PratoService pratoService;

    @GetMapping
    public List<Prato> listarTodos(){
        return pratoService.listarTodos();
    }

    @PostMapping
    public Prato salvar(@RequestBody Prato prato) {
        return pratoService.salvar(prato);
    }
}
