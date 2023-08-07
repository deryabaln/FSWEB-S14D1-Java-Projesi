package com.workintech.interitance.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }
    public void work(){
        setSalary(30000);
        System.out.println( getName() + " is Middle Developer");
    }
}
