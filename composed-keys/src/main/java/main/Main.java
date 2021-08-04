package main;

import entities.Department;
import entities.DepartmentEmbeddablePK;
import entities.DepartmentTwo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Department department = new Department();
//        department.setNumber(10);
//        department.setCode("AB");
//        department.setName("test");

        DepartmentEmbeddablePK departmentEmbeddablePK = new DepartmentEmbeddablePK();
        departmentEmbeddablePK.setNumber(11);
        departmentEmbeddablePK.setCode("BC");

        DepartmentTwo departmentTwo = new DepartmentTwo();
        departmentTwo.setName("test2");
        departmentTwo.setDepartmentEmbeddablePK(departmentEmbeddablePK);

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(departmentTwo);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            entityManager.close();
        }
    }
}
