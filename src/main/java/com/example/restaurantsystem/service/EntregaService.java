package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.Entrega;
import com.example.restaurantsystem.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {
    @Autowired
    private EntregaRepository entregaRepository;

    public Entrega salvar(Entrega entrega){
        return entregaRepository.save(entrega);
    }

    public List<Entrega> listarTodos(){
        return entregaRepository.findAll();
    }
}
