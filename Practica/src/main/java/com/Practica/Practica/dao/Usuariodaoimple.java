package com.Practica.Practica.dao;

import com.Practica.Practica.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class Usuariodaoimple implements Usuariodao{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public List<Usuario> Getusuarios() {
        String query="from usuarios";
     return entityManager.createQuery(query).getResultList();


    }
}
