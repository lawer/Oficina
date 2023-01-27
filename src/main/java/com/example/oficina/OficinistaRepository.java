package com.example.oficina;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  OficinistaRepository extends CrudRepository<Oficinista, Long> {
    List<Oficinista> findByNom(String nom);
}

