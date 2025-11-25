package com.example.restaurantsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "movimentacao")
public class MovimentacaoEstoque {

    @Id
    private String id;

    private Double quantidade;
    private Date dataCriacao;
    private String tipoMovimentacao;

}
