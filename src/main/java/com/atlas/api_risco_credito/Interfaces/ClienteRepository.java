package com.atlas.api_risco_credito.Interfaces;

import com.atlas.api_risco_credito.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
