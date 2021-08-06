package main;



import entities.Professor;
import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Student s1 = new Student();
        s1.setName("s1");

        Professor p1 = new Professor();
        p1.setName("p1");
        p1.setStudents(new ArrayList<>());
        p1.getStudents().add(s1);

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(p1);
            entityManager.persist(s1);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
