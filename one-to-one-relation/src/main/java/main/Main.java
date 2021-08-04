package main;


import entities.Company;
import entities.Detail;
import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Company company = new Company();
//        company.setName("AB");
//        company.setNumber("12");
//        company.setCity("İstanbul");
//        company.setStreet("Taksim");

        Product product = new Product();
        product.setName("Test");

        Detail detail = new Detail();
        detail.setDescription("Test description");
        detail.setProduct(product);

        product.setDetail(detail);

        try {
            entityManager.getTransaction().begin();
//            entityManager.persist(product);
            entityManager.persist(detail);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            entityManager.close();
        }
    }
}
