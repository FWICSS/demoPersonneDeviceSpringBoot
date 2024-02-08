package fr.miage.demopersonnedevice.business;

import fr.miage.demopersonnedevice.dao.entities.Personne;
import fr.miage.demopersonnedevice.dao.repo.PersonneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class GestionPersonne {
    private PersonneRepository personneRepository;

    public Personne ajouterPersonne(Personne p){
        this.personneRepository.save(p);
        return p;
    }

    public Personne getPersonne(Long id) throws PersonneInconnueException {
        return this.personneRepository.findById(id).orElseThrow(PersonneInconnueException::new);
    }

    public void updatePersonne(String prenom, Long id){
        this.personneRepository.findById(id).get().setPrenom(prenom);
    }
}
