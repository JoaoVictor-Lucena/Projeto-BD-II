package com.example.restaurantsystem.repository.mongo;

import com.example.restaurantsystem.model.Entrega;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntregaRepository extends MongoRepository<Entrega, String> {
}
