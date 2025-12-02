package com.example.restaurantsystem.repository;

import com.example.restaurantsystem.model.Carrinho;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.time.Duration;

@Repository
public class CarrinhoRepository {

    private final RedisTemplate<String, Object> redisTemplate;

    // O Spring injeta o template do Redis automaticamente
    public CarrinhoRepository(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private static final String KEY_PREFIX = "carrinho:";

    // Salvar (Com expiração de 24 horas, por exemplo)
    public void salvar(Carrinho carrinho) {
        String key = KEY_PREFIX + carrinho.getId();
        redisTemplate.opsForValue().set(key, carrinho, Duration.ofHours(24));
    }

    // Buscar
    public Carrinho buscar(String id) {
        String key = KEY_PREFIX + id;
        return (Carrinho) redisTemplate.opsForValue().get(key);
    }

    // Deletar
    public void deletar(String id) {
        String key = KEY_PREFIX + id;
        redisTemplate.delete(key);
    }
}
