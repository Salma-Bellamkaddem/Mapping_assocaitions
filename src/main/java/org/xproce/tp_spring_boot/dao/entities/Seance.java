package org.xproce.tp_spring_boot.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private Date date;
    private Date h_debut;
    private Date h_fin;
    @ManyToMany(mappedBy = "seance",fetch = FetchType.EAGER)
    private Collection<Etudiant>etudiants =new ArrayList<>();
    @ManyToOne
   private Cours cours;
}
