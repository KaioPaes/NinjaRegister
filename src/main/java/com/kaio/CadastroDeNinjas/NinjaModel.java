package com.kaio.CadastroDeNinjas;

import jakarta.persistence.*;

public class NinjaModel {
    private String nome;
    private String email;
    private int age;

    @Entity
    @Table(name = "tb_cadastro")
    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int age) {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        this.nome = nome;
        this.email = email;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
