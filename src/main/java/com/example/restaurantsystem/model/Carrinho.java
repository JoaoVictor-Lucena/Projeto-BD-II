package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "carrinho")
public class Carrinho {

    @Id
    private String id;

    private List<ItemCardapio> listaItens;
    private Double valorCarrinho;
}
