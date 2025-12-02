package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.Carrinho;
import com.example.restaurantsystem.model.ItemCardapio;
import com.example.restaurantsystem.repository.CarrinhoRepository; // O do Redis
import com.example.restaurantsystem.repository.jpa.ItemCardapioRepository; // O do Postgres
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Autowired
    private ItemCardapioRepository itemRepository;

    public Carrinho adicionarItem(String usuarioId, Long itemId) {
        ItemCardapio item = itemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        Carrinho carrinho = carrinhoRepository.buscar(usuarioId);
        if (carrinho == null) {
            carrinho = new Carrinho();
            carrinho.setId(usuarioId);
            carrinho.setListaItens(new ArrayList<>());
            carrinho.setValorTotal(0.0);
        }

        carrinho.getListaItens().add(item);
        carrinho.setValorTotal(carrinho.getValorTotal() + item.getPreco());

        carrinhoRepository.salvar(carrinho);

        return carrinho;
    }

    public Carrinho buscarCarrinho(String usuarioId) {
        return carrinhoRepository.buscar(usuarioId);
    }

    public void limparCarrinho(String usuarioId) {
        carrinhoRepository.deletar(usuarioId);
    }
}