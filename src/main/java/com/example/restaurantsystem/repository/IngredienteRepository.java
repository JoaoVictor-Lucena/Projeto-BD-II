package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.Ingrediente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredienteRepository extends MongoRepository<Ingrediente, String> {
}
