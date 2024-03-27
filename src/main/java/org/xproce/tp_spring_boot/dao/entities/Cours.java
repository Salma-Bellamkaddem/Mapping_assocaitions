package org.xproce.tp_spring_boot.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cours  {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "cours" ,fetch =FetchType.LAZY )
    private  Collection <Seance> seance;
    @OneToOne
    private Enseignant enseignant;
}
