package com.example.restaurantsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "itemCardapio")
public class ItemCardapio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private String urlFoto;
}
