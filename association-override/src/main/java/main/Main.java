package main;

import entities.Department;
import entities.DepartmentDetails;
import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static final String PERSISTENCE_UNIT = "postgresqlPersistenceUnit";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Department department = new Department();
        department.setName("d1");

        DepartmentDetails departmentDetails = new DepartmentDetails();
        departmentDetails.setDepartment(department);

        Employee employee = new Employee();
        employee.setName("e1");
        employee.setDepartmentDetails(departmentDetails);

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(department);
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
