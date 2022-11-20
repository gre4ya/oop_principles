package access_modifiers.package1;

public class BMW {

    // make, model, year, price

    public String make;
    protected String model;
    int year;
    private double price;


    private void privateMethod(){}
    void defaultMethod(){}
    protected void protectedMethods(){}
    public void publicMethod(){}


    public static void main(String[] args) {
        BMW b1 = new BMW();

    }
}
