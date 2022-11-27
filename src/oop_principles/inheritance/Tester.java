package oop_principles.inheritance;

public class Tester extends Person {

    public Tester(){}

    // 2 args constructor
    public Tester (String fName, int age){
        super(fName, age);
    }

    // 3 args constructor
    public Tester (String fName, int age, String DOB){
        super(fName, age, DOB);
    }

    // 4 args constructor
    public Tester (String fName, int age, String DOB, String SSN){
        super(fName, age, DOB, SSN);
    }

    public boolean isAutomationTester;

    // 5 args constructor
    public Tester (String fName, int age, String DOB, String SSN, boolean isAutomationTester){
        super(fName, age, DOB, SSN);
        this.isAutomationTester = isAutomationTester;
    }

    public void code(){
        System.out.println("Tester codes");
    }

    public void code(String language){
        System.out.println("Tester codes in " + language + " language");
    }






}
