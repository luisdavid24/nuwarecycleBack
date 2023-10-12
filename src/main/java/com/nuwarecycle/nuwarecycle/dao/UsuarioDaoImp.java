package com.nuwarecycle.nuwarecycle.dao;

import com.nuwarecycle.nuwarecycle.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsuarios() {
        String query="FROM usuarios";
        return entityManager.createQuery(query).getResultList();

    }
}
