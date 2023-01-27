package com.example.oficina;

import jakarta.persistence.*;

@Entity
public class Informe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String nomInforme;

    @ManyToOne
    @JoinColumn(name = "oficinista_id")
    Oficinista oficinista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomInforme() {
        return nomInforme;
    }

    public void setNomInforme(String nomInforme) {
        this.nomInforme = nomInforme;
    }

    public Oficinista getOficinista() {
        return oficinista;
    }

    public void setOficinista(Oficinista oficinista) {
        this.oficinista = oficinista;
    }
}
