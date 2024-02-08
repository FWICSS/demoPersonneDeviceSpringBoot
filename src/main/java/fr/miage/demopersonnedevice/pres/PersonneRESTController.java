package fr.miage.demopersonnedevice.pres;

import fr.miage.demopersonnedevice.business.GestionPersonne;
import fr.miage.demopersonnedevice.business.PersonneInconnueException;
import fr.miage.demopersonnedevice.dao.entities.Personne;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personnes")
@AllArgsConstructor
public class PersonneRESTController {

    private GestionPersonne gestionPersonne;
    @GetMapping("/id")
    public ResponseEntity<Personne> getPersonne(@PathVariable("id") Long id){
        try {
            return ResponseEntity.ok(this.gestionPersonne.getPersonne(id));
        } catch (PersonneInconnueException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public Personne ajoutPersonne(Personne p){
        return this.gestionPersonne.ajouterPersonne(p);
    }
}
