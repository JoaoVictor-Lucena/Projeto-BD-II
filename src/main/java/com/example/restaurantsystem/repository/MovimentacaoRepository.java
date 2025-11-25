package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.MovimentacaoEstoque;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovimentacaoRepository extends MongoRepository<MovimentacaoEstoque, String> {
}