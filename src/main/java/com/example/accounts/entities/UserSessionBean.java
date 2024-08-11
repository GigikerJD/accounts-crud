package com.example.accounts.entities;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class UserSessionBean {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private final EntityManager em = emf.createEntityManager();

    public List<UserEntity> getUsers() {
        return em.createQuery("SELECT u FROM UserEntity u", UserEntity.class).getResultList();
    }

    public UserEntity getUser(String email) {
        return em.createQuery("SELECT u FROM UserEntity u WHERE u.email = :email", UserEntity.class)
                .setParameter("email", email)
                .getSingleResult();
    }

    public void createUser(UserEntity user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public UserEntity updateUser(UserEntity user) {
        return em.merge(user);
    }

    public void deleteUser(UserEntity user) {
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
    }
}
