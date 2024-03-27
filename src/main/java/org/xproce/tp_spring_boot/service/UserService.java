package org.xproce.tp_spring_boot.service;

import org.xproce.tp_spring_boot.dao.entities.Etudiant;
import org.xproce.tp_spring_boot.dao.entities.Seance;

public interface UserService {
    Etudiant saveUser(Etudiant etudiant);
    Seance saveSeance(Seance seance);
    void addUserToSeance (String userName, String seanceName);
    Etudiant findByUserName(String userName);

}
