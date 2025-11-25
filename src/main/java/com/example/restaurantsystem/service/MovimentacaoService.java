package com.example.restaurantsystem.service;


import com.example.restaurantsystem.model.MovimentacaoEstoque;
import com.example.restaurantsystem.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoEstoque salvar(MovimentacaoEstoque movimentacaoEstoque){return movimentacaoRepository.save(movimentacaoEstoque);}

    public List<MovimentacaoEstoque> listarTodos() { return movimentacaoRepository.findAll(); }
}
