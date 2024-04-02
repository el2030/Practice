package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String url = "jdbc:mysql://localhost:3306/dhm70";
    static String username = "root";
    static String password = "root2";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        String showtables = "show tables";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(showtables);
        List<String> tableList = new ArrayList<>();
        while(resultSet.next()){
            tableList.add(resultSet.getString(1).toLowerCase());
        }
        if (!tableList.contains("employee")){
            String createEmployeeTable = "create table employee(id int auto_increment primary key, name varchar(50), age int, salary float(10,2), other_details varchar(50))";
            statement.executeUpdate(createEmployeeTable);
        }
        //addEmployee();
        displayEmployees();
        //searchForName();

    }

    public static void addEmployee() {
        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            String input = "";
            String name = "";
            String age = "";
            String salary = "";
            String otherdetails = "";
            System.out.println("Please enter the name of the employee you would like to add:");
            name = sc.nextLine();
            System.out.println("Please enter the age of the employee you would like to add:");
            age = sc.nextLine();
            System.out.println("Please enter the salary of the employee you would like to add:");
            salary = sc.nextLine();
            System.out.println("Please enter other details if necessary: ");
            otherdetails = sc.nextLine();
            String insertemployee = "insert into employee values (?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(insertemployee);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, Integer.parseInt(age));
            preparedStatement.setFloat(4, Float.parseFloat(salary));
            preparedStatement.setString(5, otherdetails);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void displayEmployees(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            String display = "select * from employee";
            ResultSet resultSet = statement.executeQuery(display);
            System.out.println("id" + "\t" + "name" + "\t" +"age" + "\t" +"salary" + "\t" + "other details");
            while(resultSet.next()){
                System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2)+ "\t"+ resultSet.getString(3)+ "\t" + resultSet.getString(4)+ "\t" + resultSet.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void searchForName(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the name of employee you would like to search");
            String name = sc.nextLine();
            String selectemployee = "select * from employee where name=?";
            PreparedStatement preparedStatement = con.prepareStatement(selectemployee);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("id" + "\t" + "name" + "\t" +"age" + "\t" +"salary" + "\t" + "other details");
            while(resultSet.next()){
                System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2)+ "\t"+ resultSet.getString(3)+ "\t" + resultSet.getString(4)+ "\t" + resultSet.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}