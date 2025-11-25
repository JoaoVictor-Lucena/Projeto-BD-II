package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.model.ItemCardapio;
import com.example.restaurantsystem.service.ItemCardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itemCardapio")
public class ItemCardapioController {

    @Autowired
    private ItemCardapioService itemCardapioService;

    @GetMapping
    public List<ItemCardapio> listarTodos(){
        return itemCardapioService.listarTodos();
    }

    @PostMapping
    public ItemCardapio salvar(@RequestBody ItemCardapio itemCardapio) {
        return itemCardapioService.salvar(itemCardapio);
    }
}
