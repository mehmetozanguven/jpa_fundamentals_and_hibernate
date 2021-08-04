package main;

import entities.Currency;
import entities.Price;
import entities.SimpleDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Price price = new Price();
//        price.setAmount(10.34);
//        price.setCurrency(Currency.TL);
//
//        Price anotherPrice = new Price();
//        anotherPrice.setAmount(5.34);
//        anotherPrice.setCurrency(Currency.EURO);

        SimpleDate date = new SimpleDate();
        date.setOnlyDate(LocalDate.now());
        date.setLocalTime(LocalTime.now());
        date.setDateWithTime(LocalDateTime.now());

        SimpleDate anotherDate = new SimpleDate();
        anotherDate.setOnlyDate(LocalDate.now());
        anotherDate.setLocalTime(LocalTime.now());
        anotherDate.setDateWithTime(LocalDateTime.now());


        try {
            entityManager.getTransaction().begin();
            entityManager.persist(date);
            entityManager.persist(anotherDate);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            entityManager.close();
        }
    }
}
