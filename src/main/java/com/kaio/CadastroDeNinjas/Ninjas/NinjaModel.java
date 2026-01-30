package com.kaio.CadastroDeNinjas.Ninjas;

import com.kaio.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int age;

    //Podem ser muitos ninjas em uma missão
    @ManyToOne()
    @JoinColumn(name = "missions_id")
    private MissoesModel missions;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int age) {
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
