package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "pedido")
public class Pedido {

    @Id
    private String id;

    private Usuario usuario;
    private List<ItemCardapio> itemCardapios;
    private double valorTotal;
    private String status;
}
