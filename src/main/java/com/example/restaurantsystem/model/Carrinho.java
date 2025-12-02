package com.example.restaurantsystem.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Carrinho implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private List<ItemCardapio> listaItens = new ArrayList<>();

    private Double valorTotal = 0.0;
}
