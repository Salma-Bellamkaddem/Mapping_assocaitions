package org.xproce.tp_spring_boot.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public  abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
 private  String nom;
  private Date dateNaissance;
}
