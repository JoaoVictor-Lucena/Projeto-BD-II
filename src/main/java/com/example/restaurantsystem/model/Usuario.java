package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "usuario")
public class Usuario {

    @Id
    private String id;

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;

}
