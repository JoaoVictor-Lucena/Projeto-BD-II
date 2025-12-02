package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.ItemCardapio;
import com.example.restaurantsystem.repository.jpa.ItemCardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCardapioService {

    @Autowired
    private ItemCardapioRepository itemCardapioRepository;

    public List<ItemCardapio> listarTodos(){
        return itemCardapioRepository.findAll();
    }

    public ItemCardapio salvar(ItemCardapio itemCardapio) {
        return itemCardapioRepository.save(itemCardapio);
    }

}
