package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.Usuario;
import com.example.restaurantsystem.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletarPorId(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    public Usuario buscarPorId(Usuario usuario) {
        return usuarioRepository.findById(usuario.getId()).get();
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }
}
