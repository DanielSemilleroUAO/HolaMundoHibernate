/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.daniel.domain.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author adseglocdom
 */
public class HolaMundoHibernate {
    
    public static void main(String[] args) {
        String hql = "SELECT p from Persona p";
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = emf.createEntityManager();
        
        Query q = entityManager.createQuery(hql);
        List<Persona> personas = q.getResultList();
        
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
    
}
