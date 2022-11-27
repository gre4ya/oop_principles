package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Employee_Exercise {
    public static void main(String[] args) {
        /*
        Create 3 companies

        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas, 111

        Create 10 employees
         */
        Company company1 = new Company("Tesla", "California", "123");
        Company company2 = new Company("USBank", "Minnesota", "000");
        Company company3 = new Company("Verizon", "Texas", "111");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii", "Developer", 25, company1),
                new Employee("Yildiz", "System Architect", 23, company2),
                new Employee("Malek", "Developer", 30, company3),
                new Employee("Saeed", "Manager", 35, company3),
                new Employee("Samir", "Tester", 20, company2),
                new Employee("Viktoriya", "Designer", 30, company1),
                new Employee("Ibrahim", "Designer", 27, company1),
                new Employee("Jeremiah", "Scrum Master", 21, company2),
                new Employee("Olena", "Tester", 29, company3),
                new Employee("Yoanna", "Tester", 23, company1)
        ));

        /*
        Write a program to find and report below information

        Employee numbers for each company
        Tesla = 4
        USBank = 3
        Verizon = 3

        Employee number for each position
        Tester = 3
        Developer = 2
        Manager = 1
        System Architect = 1
        Scrum Master = 1

        Find the youngest
        The youngest tester = Samir with the age of 20
        The youngest developer = Andrii with the age of 25
        The youngest designer = Ibrahim with the age of 27

        Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at USBank
        Scrum Master = Jeremiah works at USBank
         */

        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;
        int tester = 0, developer = 0, manager = 0, systemArchitect = 0, scrumMaster = 0;

        Employee managerEmployee = new Employee();
        Employee systemArchitectEmployee = new Employee();
        Employee scrumMasterEmployee = new Employee();
        Employee youngestTester;
        Employee youngestDeveloper;
        Employee youngestDesigner;

        for (Employee employee : employees) {
            if (employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if (employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;
            if (employee.getJobPosition().equals("Tester")) tester++;
            else if (employee.getJobPosition().equals("Developer")) developer++;
            else if (employee.getJobPosition().equals("Manager")) {
                manager++;
                managerEmployee = employee;
            }
            else if (employee.getJobPosition().equals("System Architect")) {
                systemArchitect++;
                systemArchitectEmployee = employee;
            }
            else if (employee.getJobPosition().equals("Scrum Master")) {
                scrumMaster++;
                scrumMasterEmployee = employee;
            }
        }

    System.out.println("\n");

        youngestTester = employees.stream().filter(
                e -> e.getJobPosition().equals("Tester")).min(Comparator.comparingInt(Employee::getAge)).get();
        youngestDeveloper = employees.stream().filter(
                e -> e.getJobPosition().equals("Developer")).min(Comparator.comparingInt(Employee::getAge)).get();
        youngestDesigner = employees.stream().filter(
                e -> e.getJobPosition().equals("Designer")).min(Comparator.comparingInt(Employee::getAge)).get();

    System.out.println("\n");

        System.out.println("Employee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

    System.out.println("\n");

        System.out.println("Employee number for each position");
        System.out.println("Tester = " + tester);
        System.out.println("Developer = " + developer);
        System.out.println("Manager = " + manager);
        System.out.println("System Architect = " + systemArchitect);
        System.out.println("Scrum Master = " + scrumMaster);

    System.out.println("\n");

        System.out.println("The youngest tester = " + youngestTester.getFullName() +
                            " with the age of " + youngestTester.getAge());
        System.out.println("The youngest developer = " + youngestDeveloper.getFullName() +
                            " with the age of " + youngestDeveloper.getAge());
        System.out.println("The youngest designer = " + youngestDesigner.getFullName() +
                            " with the age of " + youngestDesigner.getAge());

    System.out.println("\n");

        System.out.println("Manager = " + managerEmployee.getFullName() +
                            " works at " + managerEmployee.getCompany().getName());
        System.out.println("System Architect = " + systemArchitectEmployee.getFullName() +
                            " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println("Scrum Master = " + scrumMasterEmployee.getFullName() +
                            " works at " + scrumMasterEmployee.getCompany().getName());
    }
}

