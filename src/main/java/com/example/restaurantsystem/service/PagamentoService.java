package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.FormaPagamento;
import com.example.restaurantsystem.model.Pagamento;
import com.example.restaurantsystem.repository.jpa.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public Pagamento salvar(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }
}
