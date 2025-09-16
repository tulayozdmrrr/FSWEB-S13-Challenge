package org.example;

import org.example.Healthplan;
import org.example.Employee;
import org.example.Company;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        // Healthplan isimleri
        String hpName1 = "Basic Plan";
        String hpName2 = "Premium Plan";

        String[] empHealthPlans = new String[2];
        Employee emp1 = new Employee(1, "John Doe", "jd@test.com", "1234", empHealthPlans);
        emp1.addHealthPlan(0, hpName1);
        emp1.addHealthPlan(1, hpName2);

        System.out.println(emp1);

        String[] devs = new String[2];
        Company comp1 = new Company(1, "TechCorp", 5000, devs);
        comp1.addEmployee(0, "John");
        comp1.addEmployee(1, "Alice");
        comp1.setGiro(-100);

        System.out.println(comp1);
    }
}
