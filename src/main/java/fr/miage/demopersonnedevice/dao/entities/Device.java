package fr.miage.demopersonnedevice.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Device{

    @Id
    private long id;
    private String marque;
    private String modele;

    @ManyToOne
    private  Personne personne;
}