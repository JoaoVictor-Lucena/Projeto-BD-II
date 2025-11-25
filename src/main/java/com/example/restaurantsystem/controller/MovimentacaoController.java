package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.model.MovimentacaoEstoque;
import com.example.restaurantsystem.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimentacao")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoService movimentacaoService;

    @PostMapping
    public MovimentacaoEstoque salvar(@RequestBody MovimentacaoEstoque movimentacaoEstoque) { return movimentacaoService.salvar(movimentacaoEstoque); }

    @GetMapping
    public List<MovimentacaoEstoque> listarTodos() { return movimentacaoService.listarTodos();}
}
