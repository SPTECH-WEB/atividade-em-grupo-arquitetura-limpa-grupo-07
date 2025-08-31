package com.atlas.api_risco_credito.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor // Gera o construtor vazio (OBRIGATÓRIO pro JPA)
@AllArgsConstructor // Construtor com todos os atributos
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    private String telefone;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    private double rendaMensal;
    private int idade;
    private String profissao;
    private String risco;
    private int prioridade;
    private String estrategia;
    public Cliente(String nome, String email, String telefone, String cpf, double rendaMensal, int idade, String profissao) {
        this.id = UUID.fromString(UUID.randomUUID().toString());
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
    }




