package models;

import entities.Person;
import javax.persistence.*;
import java.util.List;

public class PersonModel {

    private EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        return emf.createEntityManager();
    }

    public void create(Person p) {
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Person p) {
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Person p) {
        EntityManager em = getEM();
        em.getTransaction().begin();
        p = em.merge(p);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    public Person findById(Person p) {
        EntityManager em = getEM();
        Person result = em.find(Person.class, p.getId());
        em.close();
        return result;
    }

    public List<Person> findAll() {
        EntityManager em = getEM();
        List<Person> list = em.createQuery("FROM Person", Person.class).getResultList();
        em.close();
        return list;
    }
}
