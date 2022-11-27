package oop_principles.inheritance;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);

        FrontendTester ft2 = new FrontendTester("Ibrahim", 29, "1983", "222", false);
        BackendTester bt2 = new BackendTester("Jane", 36, "1980", "333", false);

        Tester[] testers = {ft1, ft2, bt1, bt2}; // Polymorphic array

        /*
        Manual testers = 3
        Automation testers  = 1
        Average age = 33
         */

        int manual = 0, automation = 0, averageAge = 0;

        for (Tester tester : testers) {
            if(!tester.isAutomationTester) manual++;
            else automation++;
            averageAge += tester.age;
        }
        averageAge = averageAge / testers.length;

        System.out.println("Manual testers = " + manual);
        System.out.println("Automation testers = " + automation);
        System.out.println("Average age = " + averageAge);

    }
}
