package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    // Constructor: testlerle uyumlu (String[] alıyor)
    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String[] getHealthPlans() { return healthPlans; }

    public void addHealthPlan(int index, String planName) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (healthPlans[index] == null) {
            healthPlans[index] = planName;
        } else {
            System.out.println("Index dolu: " + healthPlans[index]);
        }
    }

    @Override
    public String toString() {
        StringBuilder plans = new StringBuilder();
        for (String hp : healthPlans) {
            if (hp != null) plans.append(hp).append(" | ");
        }
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', healthPlans=" + plans + "}";
    }
}
