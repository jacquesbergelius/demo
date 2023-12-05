package application;

import entity.*;
import dao.*;
import java.util.*;

public class CompanyApp {

    public static void main(String[] args) {

        EmployeeDao empdao = new EmployeeDao();

        List <Employee> employees = empdao.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
        }

        Employee emp = empdao.getEmployee(2);
        System.out.println(emp.getFirstName() + " " + emp.getLastName());

        //empdao.persist(new Employee("Viivi", "Puro", "viivip@mymail.fi", 8300.00));
        empdao.removeEmployee(6);

        datasource.MariaDbConnection.terminate();
    }
}
