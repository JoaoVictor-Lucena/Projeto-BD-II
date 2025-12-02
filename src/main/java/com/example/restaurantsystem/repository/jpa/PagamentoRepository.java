package com.example.restaurantsystem.repository.jpa;

import com.example.restaurantsystem.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
