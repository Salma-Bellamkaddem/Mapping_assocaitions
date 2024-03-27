package org.xproce.tp_spring_boot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.tp_spring_boot.dao.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository <Etudiant, Long> {
Etudiant findEtudiantBy(String UserName);

}
