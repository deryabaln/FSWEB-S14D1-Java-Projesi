package com.workintech.interitance.company;

public class HRManager extends Employee{
   private JuniorDeveloper[] juniorDevelopers;
   private MidDeveloper[] midDevelopers;
   private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }
    public void work(){
        setSalary(70000);
        System.out.println(getName() + " is HR Manager");
    }

    public void addEmployee(int index, JuniorDeveloper developer){
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
            } else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("index not found" +  ex.getMessage());
        }
    }

    public void addEmployee(int index, MidDeveloper developer){
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
            } else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("index not found" +  ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer){
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
            } else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("index not found" +  ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}
