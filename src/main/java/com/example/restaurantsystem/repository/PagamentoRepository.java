package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.FormaPagamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagamentoRepository extends MongoRepository<FormaPagamento, String> {
}
