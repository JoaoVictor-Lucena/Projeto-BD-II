package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ingrediente")
public class Ingrediente {

    @Id
    private String id;
    private Double quantidade;
    private String nome;
    private String unidadeDeMedida;

}
