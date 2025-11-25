package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.FormaPagamento;
import com.example.restaurantsystem.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return pagamentoRepository.save(formaPagamento);
    }

    public List<FormaPagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }
}
