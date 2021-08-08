package main;

import entities.Animal;
import entities.Cat;
import entities.Computer;
import entities.Product;
import entities.mappedSuperclass.Bicycle;
import entities.mappedSuperclass.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        Animal animal = new Animal();
//        animal.setName("animal");
//
//        Cat cat = new Cat();
//        cat.setName("cat");
//        cat.setColor("black");

//        Product product = new Product();
//        product.setName("product");
//
//        Computer computer = new Computer();
//        computer.setName("Asus");
//        computer.setRam("10GB");

        Car car = new Car();
        car.setColor("black");
        car.setName("mercedes");

        Bicycle bicycle = new Bicycle();
        bicycle.setColor("brown");
        bicycle.setModel("m1");

        try {
            entityManager.getTransaction().begin();
//            entityManager.persist(animal);
//            entityManager.persist(cat);

//            entityManager.persist(product);
//            entityManager.persist(computer);

            entityManager.persist(car);
            entityManager.persist(bicycle);

            entityManager.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
