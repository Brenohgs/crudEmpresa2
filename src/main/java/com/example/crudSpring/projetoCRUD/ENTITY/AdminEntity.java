package com.example.crudSpring.projetoCRUD.ENTITY;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "tb_admin")
@NoArgsConstructor
@Getter
@Setter
public class AdminEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador", nullable = false, unique = true)
    private Long id;

    @Column(name = "nome", nullable = false, length=100)
    private String nome;

    @Column(name = "login", nullable = false, length=20, unique=true)
    private String login;

    @Column(name = "telefone", nullable = false, length=9, unique=true)
    private int telefone;

    @Column(name = "senha", nullable = false, length=100)
    private String senha;  

    public AdminEntity(String nome, String login, String senha, int telefone) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;

}
}