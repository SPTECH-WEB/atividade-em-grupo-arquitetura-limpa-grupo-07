package com.atlas.api_risco_credito.Interfaces;
import com.atlas.api_risco_credito.entity.Cliente;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    Cliente findById(String id);
}
