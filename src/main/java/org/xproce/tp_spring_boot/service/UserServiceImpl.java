package org.xproce.tp_spring_boot.service;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.tp_spring_boot.dao.entities.Etudiant;
import org.xproce.tp_spring_boot.dao.entities.Seance;
import org.xproce.tp_spring_boot.dao.repository.EtudiantRepository;
import org.xproce.tp_spring_boot.dao.repository.SeanceRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService{


    @Autowired

    private EtudiantRepository etudiantRepository;
 @Autowired
    private SeanceRepository seanceRepository;
    @Override
    public Etudiant saveUser(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
    @Override
    public Seance saveSeance(Seance seance) {
return seanceRepository.save(seance);
    }
    @Override
     public void  addUserToSeance(String userName, String seanceName) {
        Seance seance =seanceRepository.findSeanceBy(seanceName);
        Etudiant etudiant=etudiantRepository.findEtudiantBy(userName);
        seance.getEtudiants().add(etudiant);
    }

    @Override
    public Etudiant findByUserName(String userName) {
        return etudiantRepository.findEtudiantBy(userName);
    }
}
