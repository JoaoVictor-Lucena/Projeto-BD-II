package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
