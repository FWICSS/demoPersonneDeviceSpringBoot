package fr.miage.demopersonnedevice.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Personne {

    @Id
    private Long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "personne")
    private List<Device> devices;
}
