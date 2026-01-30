package com.kaio.CadastroDeNinjas.Missoes;

import com.kaio.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dificulty;
    //Um ninja pode ter somente uma missão por vez
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninja;

}
