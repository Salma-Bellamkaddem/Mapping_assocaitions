package org.xproce.tp_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.tp_spring_boot.dao.entities.Enseignant;
import org.xproce.tp_spring_boot.dao.entities.Etudiant;
import org.xproce.tp_spring_boot.dao.entities.Seance;
import org.xproce.tp_spring_boot.dao.repository.EnseignantRepository;
import org.xproce.tp_spring_boot.dao.repository.EtudiantRepository;
import org.xproce.tp_spring_boot.dao.repository.PersonneRepository;
import org.xproce.tp_spring_boot.service.UserService;

import java.util.Date;

@SpringBootApplication
public class TpSpringBootApplication implements CommandLineRunner {
    @Autowired
private PersonneRepository  personneRepository;

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private EnseignantRepository enseignantRepository;
@Autowired
private UserService userService;
    public static void main(String[] args) {

        SpringApplication.run(TpSpringBootApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");


        Etudiant etudiant=new Etudiant();
        etudiant.setNom("Ahmed");
        etudiant.setDateNaissance(new Date());
        etudiant.setMatricule("1Z22E");

       userService.saveUser(etudiant);
        Enseignant enseignant= new Enseignant();
        enseignant.setNom("Mohamed");
        enseignant.setDateNaissance(new Date());
        enseignant.setMatiere("UML");
        personneRepository.save(enseignant);

userService.saveUser(new Etudiant("12355",null));
userService.saveUser(new Etudiant("1EER3",null));
userService.saveSeance(new Seance(null,"seance1",null,null,null,null,null));
userService.saveSeance(new Seance(null,"seance2",null,null,null,null,null));
userService.addUserToSeance("12355","Seance1");
userService.addUserToSeance("1Z22E","Seance1");
Etudiant etudiant1 =userService.findByUserName("Ahmed");
        System.out.println("Username:"+etudiant1.getNom());
        System.out.println("date:"+etudiant1.getDateNaissance());
        System.out.println("Seance:");
        etudiant1.getSeance().forEach(g->{
            System.out.println("Seance:"+g.toString());
        });






    }
}
