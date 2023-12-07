package application;

import entity.*;
import dao.*;
public class CompanyApp {
    public static void main(String[] args) {
        EmployeeDao empdao = new EmployeeDao();
        DepartmentDao deptdao = new DepartmentDao();

        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketing");

        deptdao.persist(d1);
        deptdao.persist(d2);

        empdao.persist(new Employee("Viivi", "Puro", "viivip@mymail.fi", 7300.00, d2));
        empdao.persist(new Employee("Tero", "Koski", "tero.koski@mymail.fi", 3750.00, d1));
        empdao.persist(new Employee("Ahmed", "Bakir", "ahmed.bakir@mymail.fi", 4800.00, d1));
    }
}