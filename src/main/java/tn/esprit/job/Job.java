package tn.esprit.job;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
public class Job implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getService() {
        return service;
    }

    public boolean isEtat() {
        return etat;
    }

    @Id
    @GeneratedValue
    private int id;
    private String service;
    private boolean etat;

    public Job(int id, String service, boolean etat) {
        this.id = id;
        this.service = service;
        this.etat = etat;
    }

    public Job() {
    }
}
