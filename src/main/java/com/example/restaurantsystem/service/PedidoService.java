package com.example.restaurantsystem.service;

import com.example.restaurantsystem.controller.DTO.PedidoDTO;
import com.example.restaurantsystem.model.Pedido;
import com.example.restaurantsystem.model.ItemCardapio;
import com.example.restaurantsystem.model.Usuario;
import com.example.restaurantsystem.repository.PedidoRepository;
import com.example.restaurantsystem.repository.ItemCardapioRepository;
import com.example.restaurantsystem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ItemCardapioRepository itemCardapioRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Pedido criarPedido(PedidoDTO pedidoDTO) {

        Usuario usuarioEncontrado = usuarioRepository.findById(pedidoDTO.getUsuarioId()).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        List<ItemCardapio> itemCardapios = itemCardapioRepository.findAllById(pedidoDTO.getPratosId());

        Double total = 0.0;
        for (ItemCardapio itemCardapio : itemCardapios) {
            total += itemCardapio.getPreco();
        }

        Pedido pedido = new Pedido();
        pedido.setUsuario(usuarioEncontrado);
        pedido.setItemCardapios(itemCardapios);
        pedido.setValorTotal(total);
        pedido.setStatus("Em entrega");

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }
}
