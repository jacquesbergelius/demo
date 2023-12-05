package dao;

import entity.Employee;
import java.sql.*;
import datasource.MariaDbConnection;
import java.util.*;

public class EmployeeDao {

    public List<Employee> getAllEmployees() {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT first_name, last_name, email, salary FROM employee";
        List<Employee> employees = new ArrayList<Employee>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                String firstName = rs.getString(1);
                String lastName = rs.getString(2);
                String email = rs.getString(3);
                double salary = rs.getDouble(4);
                Employee emp = new Employee(firstName, lastName, email, salary);
                employees.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }


    public Employee getEmployee(int id) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT first_name, last_name, email, salary FROM employee WHERE id=?";

        String firstName = null;
        String lastName = null;
        String email = null;
        double salary = 0.0;
        int count = 0;

        try {
            Statement s = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                firstName = rs.getString(1);
                lastName = rs.getString(2);
                email = rs.getString(3);
                salary = rs.getDouble(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (count==1) {
            return new Employee(firstName, lastName, email, salary);
        }
        else {
            return null;
        }
    }

    public Employee removeEmployee(int id) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "DELETE FROM employee WHERE id=?";

        String firstName = null;
        String lastName = null;
        String email = null;
        double salary = 0.0;
        int count = 0;

        try {
            Statement s = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                firstName = rs.getString(1);
                lastName = rs.getString(2);
                email = rs.getString(3);
                salary = rs.getDouble(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (count==1) {
            return new Employee(firstName, lastName, email, salary);
        }
        else {
            return null;
        }
    }

    public void persist(Employee emp) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "INSERT INTO employee (first_name, last_name, email, salary) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getFirstName());
            ps.setString(2, emp.getLastName());
            ps.setString(3, emp.getEmail());
            ps.setDouble(4, emp.getSalary());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
