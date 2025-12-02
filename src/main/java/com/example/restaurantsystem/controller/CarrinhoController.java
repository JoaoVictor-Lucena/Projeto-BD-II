package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.model.Carrinho;
import com.example.restaurantsystem.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;
    @PostMapping("/{usuarioId}/adicionar/{itemId}")
    public ResponseEntity<Carrinho> adicionarItem(@PathVariable String usuarioId,
                                                  @PathVariable Long itemId) {
        Carrinho carrinho = carrinhoService.adicionarItem(usuarioId, itemId);
        return ResponseEntity.ok(carrinho);
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<Carrinho> verCarrinho(@PathVariable String usuarioId) {
        Carrinho carrinho = carrinhoService.buscarCarrinho(usuarioId);

        if (carrinho == null) {
            carrinho = new Carrinho();
            carrinho.setId(usuarioId);
            carrinho.setListaItens(new ArrayList<>());
            carrinho.setValorTotal(0.0);
        }

        return ResponseEntity.ok(carrinho);
    }

    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<Void> limparCarrinho(@PathVariable String usuarioId) {
        carrinhoService.limparCarrinho(usuarioId);
        return ResponseEntity.noContent().build();
    }
}