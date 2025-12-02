package com.example.restaurantsystem.repository.jpa;

import com.example.restaurantsystem.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
