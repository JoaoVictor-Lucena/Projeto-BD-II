package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "pratos")
public class Prato {

    @Id
    private String id;

    private String nome;
    private Double preco;
    private String descricao;
    private String categoria;

    private String urlFoto;


}
