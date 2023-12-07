package dao;

import entity.*;
import jakarta.persistence.EntityManager;

public class DepartmentDao {

    public void persist(Department dept) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(dept);
        em.getTransaction().commit();
    }

    public Department find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Department dept = em.find(Department.class, id);
        return dept;
    }
}