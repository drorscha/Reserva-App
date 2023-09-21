/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.app.model;

import lombok.Data;

import javax.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data

public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private boolean disponivel;

    // Construtor vazio (necessário para JPA)
    public Equipamento() {
    }

    // Construtor com parâmetros
    public Equipamento(String nome, String categoria, boolean disponivel) {
        this.nome = nome;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    // Getters e setters (gerados pelo Lombok)
}
