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
        Designer = 1
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
        int tester = 0, developer = 0, designer = 0, manager = 0, systemArchitect = 0, scrumMaster = 0;

        Employee managerEmployee = null;
        Employee systemArchitectEmployee = null;
        Employee scrumMasterEmployee = null;

        Employee youngestTester = new Employee();
        Employee youngestDeveloper = new Employee();
        Employee youngestDesigner = new Employee();

        youngestTester.setAge(Integer.MAX_VALUE);
        youngestDeveloper.setAge(Integer.MAX_VALUE);
        youngestDesigner.setAge(Integer.MAX_VALUE);

        for (Employee employee : employees) {

            if (employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if (employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            switch (employee.getJobPosition()) {
                case "Tester":
                    tester++;
                    if(employee.getAge() < youngestTester.getAge()) youngestTester = employee;
                    break;
                case "Developer":
                    developer++;
                    if(employee.getAge() < youngestDeveloper.getAge()) youngestDeveloper = employee;
                    break;
                case "Designer":
                    designer++;
                    if(employee.getAge() < youngestDesigner.getAge()) youngestDesigner = employee;
                    break;
                case "Manager":
                    manager++;
                    managerEmployee = employee;
                    break;
                case "System Architect":
                    systemArchitect++;
                    systemArchitectEmployee = employee;
                    break;
                case "Scrum Master":
                    scrumMaster++;
                    scrumMasterEmployee = employee;
                    break;
            }
        }
//        youngestTester = employees.stream().filter(
//                e -> e.getJobPosition().equals("Tester")).min(Comparator.comparingInt(Employee::getAge)).get();
//        youngestDeveloper = employees.stream().filter(
//                e -> e.getJobPosition().equals("Developer")).min(Comparator.comparingInt(Employee::getAge)).get();
//        youngestDesigner = employees.stream().filter(
//                e -> e.getJobPosition().equals("Designer")).min(Comparator.comparingInt(Employee::getAge)).get();

        System.out.println("Employee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

    System.out.println("\n");

        System.out.println("Employee number for each position");
        System.out.println("Tester = " + tester);
        System.out.println("Developer = " + developer);
        System.out.println("Designer = " + designer);
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

        System.out.println(managerEmployee.getJobPosition() + " = " + managerEmployee.getFullName() +
                            " works at " + managerEmployee.getCompany().getName());
        System.out.println(systemArchitectEmployee.getJobPosition() + " = " + systemArchitectEmployee.getFullName() +
                            " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println(scrumMasterEmployee.getJobPosition() + " = " + scrumMasterEmployee.getFullName() +
                            " works at " + scrumMasterEmployee.getCompany().getName());
    }
}

