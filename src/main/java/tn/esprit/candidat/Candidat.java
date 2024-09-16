package tn.esprit.candidat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidat implements Serializable {
    @Id
    @GeneratedValue
    private  int id;
    private String nom,prenom,mail;

    public Candidat(String nom) {
        this.nom = nom;
    }


    public Candidat(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }


}
