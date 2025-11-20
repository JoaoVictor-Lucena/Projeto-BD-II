package com.example.restaurantsystem.service;

import com.example.restaurantsystem.controller.DTO.PedidoDTO;
import com.example.restaurantsystem.model.Pedido;
import com.example.restaurantsystem.model.Prato;
import com.example.restaurantsystem.model.Usuario;
import com.example.restaurantsystem.repository.PedidoRepository;
import com.example.restaurantsystem.repository.PratoRepository;
import com.example.restaurantsystem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private PratoRepository pratoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Pedido criarPedido(PedidoDTO pedidoDTO) {

        Usuario usuarioEncontrado = usuarioRepository.findById(pedidoDTO.getUsuarioId()).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        List<Prato> pratos = pratoRepository.findAllById(pedidoDTO.getPratosId());

        Double total = 0.0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }

        Pedido pedido = new Pedido();
        pedido.setUsuario(usuarioEncontrado);
        pedido.setPratos(pratos);
        pedido.setValorTotal(total);
        pedido.setStatus("Em entrega");

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }
}
