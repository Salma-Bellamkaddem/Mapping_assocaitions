package org.xproce.tp_spring_boot.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Enseignant  extends  Personne{
    private  String matiere;
    @OneToOne(mappedBy = "enseignant")
    private Cours cours;

}
