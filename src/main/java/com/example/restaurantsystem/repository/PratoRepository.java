package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.Prato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PratoRepository extends MongoRepository<Prato, String> {
}
