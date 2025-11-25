package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.ItemCardapio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCardapioRepository extends MongoRepository<ItemCardapio, String> {
}
