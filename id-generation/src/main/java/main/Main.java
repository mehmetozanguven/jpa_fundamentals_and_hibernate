package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Product product = new Product();
        product.setName("Cheese");
        product.setPrice(5.4);
        product.setExpirationDate(LocalDate.now());

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
