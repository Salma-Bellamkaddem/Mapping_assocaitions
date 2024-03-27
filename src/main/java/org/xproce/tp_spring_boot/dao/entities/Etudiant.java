package org.xproce.tp_spring_boot.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Etudiant extends  Personne {
    private String matricule;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Seance>seance =new ArrayList<>();
}
