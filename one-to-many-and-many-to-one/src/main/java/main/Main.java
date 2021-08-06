package main;



import entities.Deparment;
import entities.Document;
import entities.Employee;
import entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Employee employee = new Employee();
//        employee.setName("Test");
//
//        Deparment deparment = new Deparment();
//        deparment.setName("Department");
//        deparment.setEmployees(new ArrayList<>());
//        deparment.getEmployees().add(employee);

        Person person = new Person();
        person.setName("Ozan");

        try {
            entityManager.getTransaction().begin();
//            entityManager.persist(person);
//            Person ozan = entityManager.find(Person.class, 2L);
//            Document document = new Document();
//            document.setName("test document");
//            document.setPerson(ozan);
//            entityManager.persist(document);
            Document document = entityManager.find(Document.class, 5L);
            entityManager.remove(document);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
