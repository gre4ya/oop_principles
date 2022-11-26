package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {

        AccountHolder accountHolder = new AccountHolder();

        accountHolder.firstName = "John";
        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312) 000-0000";
        // accountHolder.SSN = "000-00-0000"; cannot assign value without set method
        accountHolder.setSSN("000-00-0000");
        accountHolder.setBalance(199.99);

        System.out.println(accountHolder.firstName);
        System.out.println(accountHolder.getSSN()); // 000-00-0000
        System.out.println(accountHolder.getBalance()); // 199.99
        System.out.println(accountHolder);


    }

}
