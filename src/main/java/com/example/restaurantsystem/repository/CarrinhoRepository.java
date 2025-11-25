package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.Carrinho;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarrinhoRepository extends MongoRepository<Carrinho, String> {
}
