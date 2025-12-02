package com.example.restaurantsystem.repository.jpa;

import com.example.restaurantsystem.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
}
