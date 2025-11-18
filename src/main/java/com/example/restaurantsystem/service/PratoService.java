package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.Prato;
import com.example.restaurantsystem.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PratoService {

    @Autowired
    private PratoRepository pratoRepository;

    public List<Prato> listarTodos(){
        return pratoRepository.findAll();
    }

    public Prato salvar(Prato prato) {
        return pratoRepository.save(prato);
    }

    public void deletarPorId(Prato prato) {
        pratoRepository.delete(prato);
    }

    public Prato buscarPorId(Prato prato) {
        return pratoRepository.findById(prato.getId()).get();
    }
}
