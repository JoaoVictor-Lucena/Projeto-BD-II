package com.example.restaurantsystem.controller;

import com.example.restaurantsystem.controller.DTO.PedidoDTO;
import com.example.restaurantsystem.model.Pedido;
import com.example.restaurantsystem.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido salvar(@RequestBody PedidoDTO pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listarTodos(){
        return pedidoService.listarTodos();
    }
}
