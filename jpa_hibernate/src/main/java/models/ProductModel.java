package models;

import entities.Product;
import javax.persistence.*;
import java.util.List;

public class ProductModel {

    private EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        return emf.createEntityManager();
    }

    public void create(Product p) {
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Product p) {
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Product p) {
        EntityManager em = getEM();
        em.getTransaction().begin();
        p = em.merge(p);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    public Product findById(Product p) {
        EntityManager em = getEM();
        Product result = em.find(Product.class, p.getId());
        em.close();
        return result;
    }

    public List<Product> findAll() {
        EntityManager em = getEM();
        List<Product> list = em.createQuery("FROM Product", Product.class).getResultList();
        em.close();
        return list;
    }
}
