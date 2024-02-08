package fr.miage.demopersonnedevice.dao.repo;

import fr.miage.demopersonnedevice.dao.entities.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonneRepository extends CrudRepository<Personne,Long> {

}
