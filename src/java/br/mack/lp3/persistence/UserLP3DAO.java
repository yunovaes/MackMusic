/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.persistence;

import br.mack.lp3.persistence.entities.UserLP3;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

/**
 *
 * @author 41526740
 */

@LocalBean
@Stateful
public class UserLP3DAO implements GenericDAO<UserLP3> {

    @PersistenceContext(unitName = "JavaLp3PU", type = PersistenceContextType.EXTENDED)
    private EntityManager em;
    
    @Override
    public void create(UserLP3 e) {
        em.persist(e);
    }

    @Override
    public List<UserLP3> readAll(long id) {
        Query q = em.createQuery("select u from UserLP3 u");
        List<UserLP3> lista = q.getResultList();
        return lista;
        //return em.createQuery("select u from UserLP3 u").getResultList();
    }

    @Override
    public UserLP3 readById(long id) {
        return em.find(UserLP3.class, id);  //EAGER
        // return em.getReference(UserLP3.class, id);  -- -- LAZY
    }
    
    public UserLP3 readByEmail (String email) {
        Query q = em.createQuery("SELECT u FROM UserLP3 u WHERE u.email = :email", UserLP3.class);
        q.setParameter("email", email);
        return (UserLP3) q.setParameter("email", email).getSingleResult();
    }

    @Override
    public void update(UserLP3 e) {
        em.persist(em.merge(e));
    }

    @Override
    public void delete(UserLP3 e) {
        em.remove(em.merge(e));
    }
    
}
