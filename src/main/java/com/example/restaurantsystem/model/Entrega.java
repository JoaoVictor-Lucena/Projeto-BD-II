package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "entrega")
public class Entrega {

    @Id
    private String id;

    private String nomeDoEntregador;
    private int telefoneDoEntregador;
}
