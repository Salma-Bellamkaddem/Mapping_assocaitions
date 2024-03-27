package org.xproce.tp_spring_boot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.tp_spring_boot.dao.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant , Long> {
}
