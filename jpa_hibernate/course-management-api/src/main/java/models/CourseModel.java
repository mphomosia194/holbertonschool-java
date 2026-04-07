package models;

import entities.Course;
import javax.persistence.*;
import java.util.List;

public class CourseModel {

    private EntityManager em() {
        return Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
    }

    public void create(Course c) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }

    public Course findById(Long id) {
        EntityManager em = em();
        Course c = em.find(Course.class, id);
        em.close();
        return c;
    }

    public List<Course> findAll() {
        EntityManager em = em();
        List<Course> list = em.createQuery("FROM Course", Course.class).getResultList();
        em.close();
        return list;
    }

    public void update(Course c) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Course c) {
        EntityManager em = em();
        em.getTransaction().begin();
        c = em.merge(c);
        em.remove(c);
        em.getTransaction().commit();
        em.close();
    }
}
