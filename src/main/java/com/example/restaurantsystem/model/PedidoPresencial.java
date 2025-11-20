package com.example.restaurantsystem.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pedidos")
public class PedidoPresencial extends Pedido{
}
