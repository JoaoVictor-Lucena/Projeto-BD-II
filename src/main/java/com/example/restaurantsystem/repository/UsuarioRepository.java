package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
