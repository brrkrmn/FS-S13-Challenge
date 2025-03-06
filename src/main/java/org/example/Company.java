package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return id + name + giro + developerNames;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = giro < 0 ? 0 : giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index > developerNames.length - 1 || index < 0) {
            System.out.println("Exceeding developerNames array.");
        } else if (developerNames[index] != null) {
            System.out.println("Index already assigned.");
        } else {
            developerNames[index] = name;
        }
    }
}
