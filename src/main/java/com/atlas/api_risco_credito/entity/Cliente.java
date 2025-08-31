package com.atlas.api_risco_credito.entity;

import java.util.UUID;

public class Cliente {
    private final String id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private double rendaMensal;
    private int idade;
    private String profissao;
    private String risco;
    private int prioridade;
    private String estrategia;
    public Cliente(String nome, String email, String telefone, String cpf, double rendaMensal, int idade, String profissao) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
    }
    // Getters e Setters
    public String getId() { return id; }

    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public String getTelefone() { return telefone; }

    public String getCpf() { return cpf; }

    public double getRendaMensal() { return rendaMensal; }

    public int getIdade() { return idade; }

    public String getProfissao() { return profissao; }

    public String getRisco() { return risco; }

    public void setRisco(String risco) { this.risco = risco; }

    public int getPrioridade() { return prioridade; }

    public void setPrioridade(int prioridade) { this.prioridade = prioridade; }

    public String getEstrategia() { return estrategia; }

    public void setEstrategia(String estrategia) { this.estrategia = estrategia; }
}

