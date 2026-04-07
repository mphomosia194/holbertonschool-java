package models;

import entities.Student;
import javax.persistence.*;
import java.util.List;

public class StudentModel {

    private EntityManager em() {
        return Persistence.createEntityManagerFactory("course-management-jpa").createEntityManager();
    }

    public void create(Student s) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
        em.close();
    }

    public Student findById(Long id) {
        EntityManager em = em();
        Student s = em.find(Student.class, id);
        em.close();
        return s;
    }

    public List<Student> findAll() {
        EntityManager em = em();
        List<Student> list = em.createQuery("FROM Student", Student.class).getResultList();
        em.close();
        return list;
    }

    public void update(Student s) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Student s) {
        EntityManager em = em();
        em.getTransaction().begin();
        s = em.merge(s);
        em.remove(s);
        em.getTransaction().commit();
        em.close();
    }
}
