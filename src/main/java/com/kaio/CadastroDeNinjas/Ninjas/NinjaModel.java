package com.kaio.CadastroDeNinjas.Ninjas;

import com.kaio.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
