package com.workintech.inheritance.company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    public void work(){
        setSalary(25000);
        System.out.println(getName() + " is Junior Developer");
    }
}
