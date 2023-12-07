package dao;

import entity.*;
import jakarta.persistence.EntityManager;

public class EmployeeDao {

    public void persist(Employee emp) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
    }

    public Employee find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Employee emp = em.find(Employee.class, id);
        return emp;
    }

    public void update(Employee emp) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
    }

    public void delete(Employee emp) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(emp);
        em.getTransaction().commit();
    }
}
