package recap;

public class Dinosaur extends Animal{

    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct) {
        super(name, age, height, weight, diet, isAlive, isExtinct);
    }

    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct, String size, boolean hasSpike) {
        super(name, age, height, weight, diet, isAlive, isExtinct);
        this.size = size;
        this.hasSpike = hasSpike;
    }

    public static boolean isReptile = true;
    public String size; // big, normal, giant
    public boolean hasSpike;

    @Override
    public double attack() {
        double damage = weight * height;
        switch (size) {
            case "normal":
                System.out.println(name + " is attacking. It damaged \"" + damage + "\"");
                break;
            case "big":
                damage *= 3;
                System.out.println(name + " is attacking. It damaged \"" + damage + "\"");
                break;
            case "giant":
                damage *= 10;
                System.out.println(name + " is attacking. It damaged \"" + damage + "\"");
                break;
        }
        if(hasSpike) System.out.println("Animal had spikes, the attack was critical");
        else System.out.println("Animal didn't have spikes, the attack was not critical");
        return damage;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "name='" + name + '\'' +
                ( isAlive ? ", age=" + age : "") +
                ", size='" + size + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hasSpike=" + hasSpike +
                ", diet='" + diet + '\'' +
                ", isAlive=" + isAlive +
                ", isExtinct=" + isExtinct +
                '}';
    }

    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur("T-Rex", 6, 8.9, 500.3, "carnivore", false, true, "big", true);
        System.out.println(dinosaur);
        dinosaur.attack();



    }
}
