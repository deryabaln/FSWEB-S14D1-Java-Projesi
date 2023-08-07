package com.workintech.inheritance.company;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work(){
        System.out.println("Employee starts to working");
    }

    public void setSalary(double salary) {
        this.salary = salary < 0 ? 0 : salary ;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id: " + id);
        builder.append(" name: " + name);
        return builder.toString();
    }
}
