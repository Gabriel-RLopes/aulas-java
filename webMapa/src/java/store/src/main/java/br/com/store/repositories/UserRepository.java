/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package store.src.main.java.br.com.store.repositories;

/**
 *
 * @author grgab
 */
import store.src.main.java.br.com.store.models.User;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserRepository implements Serializable{

    private final EntityManager entityManager;

    public UserRepository(EntityManager em) {
        this.entityManager = em;
    }

    public boolean create(User user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            //log e
            return false;
        }
    }

    public List<User> getAll() {
        TypedQuery<User> query = entityManager.createNamedQuery("User.findAll", User.class);
        return query.getResultList();
    }

}
