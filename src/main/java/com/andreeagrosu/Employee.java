package com.andreeagrosu;

public abstract class Employee {

    private String name;
    private double salary;
    private int id;
    private static int counter=0;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
