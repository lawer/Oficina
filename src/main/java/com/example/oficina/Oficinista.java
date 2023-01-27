package com.example.oficina;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Oficinista {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String nom;


    @OneToMany(mappedBy = "id")
    private List<Informe> informes;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Oficinista{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
