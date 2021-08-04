package main;

import entities.Company;
import entities.embeddables.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Address address = new Address();
        address.setCity("İstanbul");
        address.setNumber("123");
        address.setStreet("Taksim");

        Company company = new Company();
        company.setName("test");
        company.setAddress(address);

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(company);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            entityManager.close();
        }
    }
}
