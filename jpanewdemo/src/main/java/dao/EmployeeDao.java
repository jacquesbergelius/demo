package dao;

import entity.*;
import jakarta.persistence.EntityManager;

import java.util.List;

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

    public List<Employee> findAll() {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        List<Employee> emps = em.createQuery("select e from Employee e").getResultList();
        //List<Employee> emps = em.createQuery("from Employee").getResultList();
        return emps;
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
