package oopPractise;

public class Sword {
    // 1. Constructor
    // Modified
//    public Sword(){
//        System.out.println("Default constructor is running");
//    }
    public Sword(String material){
       this.material = material; // null -> "iron"
     }


    // Modified constructor
    public Sword(double weight, double length, String name, String material){
        this(material);
        this.weight = weight; // assign the value of the local variable to the instance value
        this.length = length;
        this.name = name;
    }

    // 2. Instance variables

    // Static -> belongs to the class, What does every sword has?
    public static final boolean hasHandle = true;
    public static boolean isSharp;

    // Non-static -> belongs to the object, What is changing from sword to sword?
    public double weight;
    public double length;
    public String name;
    public String material;

    // 3. Methods -> What does a sword do?

    // static -> belongs to the class, What does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    public static void damage(){
        if(isSharp) System.out.println("The sword damages more");
        else System.out.println("The sword damages less");
    }
    // non-static -> belongs to the object, What does every sword do differently?
    // weight * length = 2 pounds * 10 inches = 20 points
    // weight * length = 10 pounds * 15 inches = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points.");
    }

    //running only once before everything
    static{
        System.out.println("Starting the sword making furnace");
    }

    // running everytime when creating an object before everything after static block
    {
        System.out.println("Heating up the furnace");
    }


    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
