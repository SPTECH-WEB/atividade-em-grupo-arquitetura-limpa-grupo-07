package com.atlas.api_risco_credito.useCases;

import com.atlas.api_risco_credito.entity.Cliente;
import com.atlas.api_risco_credito.Interfaces.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteUseCase {
    private final ClienteRepository repository;

    public ClienteUseCase(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente criarCliente(Cliente cliente){
        aplicarRegraRisco(cliente);
        return repository.save(cliente);
    }

    public Cliente buscarCliente(String id) {
        return repository.findById(id);
    }

    private void aplicarRegraRisco(Cliente cliente) {
        if (cliente.getRendaMensal() < 3000) {
            cliente.setRisco("Alto");
            cliente.setPrioridade(1);
            cliente.setEstrategia("Contato telefonico em ate 24h + analise critica");
        } else if (cliente.getRendaMensal() > 6000 && cliente.getIdade() > 30) {
            cliente.setRisco("Baixo");
            cliente.setPrioridade(3);
            cliente.setEstrategia("Contato automatico por e-mail");
        } else {
            cliente.setRisco("Medio");
            cliente.setPrioridade(2);
            cliente.setEstrategia("Analise manual em ate 48h");
        }
    }
}