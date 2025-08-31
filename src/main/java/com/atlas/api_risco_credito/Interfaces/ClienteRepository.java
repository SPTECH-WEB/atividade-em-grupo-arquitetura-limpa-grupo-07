package com.atlas.api_risco_credito.Interfaces;
import com.fintech.credito.entities.Cliente;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    Cliente findById(String id);
}
