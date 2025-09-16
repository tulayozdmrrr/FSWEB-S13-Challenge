package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public String getName() { return name; }
    public double getGiro() { return giro; }
    public String[] getDeveloperNames() { return developerNames; }

    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public void addEmployee(int index, String employeeName) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = employeeName;
        } else {
            System.out.println("Index dolu: " + developerNames[index]);
        }
    }

    @Override
    public String toString() {
        StringBuilder devs = new StringBuilder();
        for (String dev : developerNames) {
            if (dev != null) devs.append(dev).append(" | ");
        }
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=" + devs + "}";
    }
}
