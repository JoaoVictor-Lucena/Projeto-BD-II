package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.Ingrediente;
import com.example.restaurantsystem.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente salvar(Ingrediente ingrediente){
        return ingredienteRepository.save(ingrediente);

    }

    public List<Ingrediente> listarTodos(){
        return ingredienteRepository.findAll();
    }
}
