package com.example.restaurantsystem.service;

import com.example.restaurantsystem.controller.DTO.PedidoDTO;
import com.example.restaurantsystem.model.Pedido;
import com.example.restaurantsystem.model.ItemCardapio;
import com.example.restaurantsystem.model.Usuario;
import com.example.restaurantsystem.repository.jpa.PedidoRepository;
import com.example.restaurantsystem.repository.jpa.ItemCardapioRepository;
import com.example.restaurantsystem.repository.jpa.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ItemCardapioRepository itemRepository;

    public Pedido criarPedido(PedidoDTO dto) {
        Pedido pedido = new Pedido();

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        pedido.setUsuario(usuario);

        List<ItemCardapio> itens = itemRepository.findAllById(dto.getItensId());
        pedido.setItemCardapios(itens);

        double total = itens.stream().mapToDouble(ItemCardapio::getPreco).sum();
        pedido.setValorTotal(total);

        pedido.setStatus("PENDENTE");

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }
}