package com.example.restaurantsystem.controller.DTO;

import lombok.Data;

import java.util.List;

@Data
public class PedidoDTO {
    private String usuarioId;
    private List<String> pratosId;
}
