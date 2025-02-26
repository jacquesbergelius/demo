package application;

import entity.*;
import dao.*;

import java.util.List;

public class CompanyApp {
    public static void main(String[] args) {

        EmployeeDao empdao = new EmployeeDao();

        empdao.persist(new Employee("Viivi", "Puro", 23, "viivip@mymail.fi", 7300.00));
        empdao.persist(new Employee("Tero", "Koski", 44, "tero.koski@mymail.fi", 3750.00));

        Employee emp = empdao.find(3);
        System.out.println(emp.getFirstName() + " " + emp.getLastName());

        emp.setLastName("Benzino"); emp.setAge(51);
        empdao.update(emp);

        emp = empdao.find(2);
        emp.setSalary(14532.0); emp.setAge(33);
        empdao.update(emp);

        List<Employee> list = empdao.findAll();
        for (Employee employee : list) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }
}
