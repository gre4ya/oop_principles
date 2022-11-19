package class_object;

public class Animal {
    public static boolean isExtinct = true;
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;
    // execute the code below whenever an Animal object is garbage collected
    // you wil; override finalize() method if yuo would like to execute a block of right after your object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println(getClass().getName() + " " + this.name + "An Animal object is destroyed");
    }

    public static void main(String[] args) {
//        Animal a1 = new Animal();
//        Animal a2 = new Animal("Dog", 3);
//        Animal a3 = new Animal("Cow", 5);
//        Animal a4 = new Animal("Cat", 1);
        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 5, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("\n-------Printing the objects-------");

        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

        System.out.println("---------static instance variable---------");

        System.out.println(Animal.isExtinct);  // true

        Animal.isExtinct = false;

        System.out.println(Animal.isExtinct);  // false

    }
    public Animal(){}

    public Animal(String name, int age){
       // System.out.println("This is 2-arg constructor");
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        this(name, age);
        //System.out.println("This is 5-arg constructor");
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    @Override
    public String toString() {

        String result = "Animal{name='" + name + "', age=" + age;
        if (isCarnivore) result += ", isCarnivore=" + isCarnivore;
        if (isHerbivore) result += ", isHerbivore=" + isHerbivore;
        if (isOmnivore) result += ", isOmnivore=" + isOmnivore;

        result += "}";

        return result;
    }


}
