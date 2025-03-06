package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] developers = {"Berra", "Alice", "Alex"};
        String[] plans = {"plan1", "plan2"};

        Company company = new Company(123, "Brr", 99000, developers);
        Employee employee = new Employee(456, "Berra Karaman", "test@test.com", "123123", plans );
        Healthplan healthPlan = new Healthplan(789, "Basic plan", Plan.BASIC);

        company.toString();
        employee.toString();
        healthPlan.toString();
    }
}