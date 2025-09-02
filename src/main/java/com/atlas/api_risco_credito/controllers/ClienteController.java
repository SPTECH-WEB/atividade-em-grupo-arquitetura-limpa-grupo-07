package com.atlas.api_risco_credito.controllers;

import com.atlas.api_risco_credito.useCases.ClienteUseCase;
import com.atlas.api_risco_credito.entity.Cliente;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteUseCase clienteUseCase;

    public ClienteController(ClienteUseCase clienteUseCase) {
        this.clienteUseCase = clienteUseCase;
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteUseCase.criarCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        Cliente cliente = clienteUseCase.buscarCliente(id.toString());
        if (cliente == null) throw new RuntimeException("Cliente não encontrado");
        return cliente;
    }
}