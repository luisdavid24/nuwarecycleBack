package com.nuwarecycle.nuwarecycle.dao;

import com.nuwarecycle.nuwarecycle.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class UsuarioDaoImp implements UsuarioDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query="FROM usuarios";
        return entityManager.createQuery(query).getResultList();

    }
}
