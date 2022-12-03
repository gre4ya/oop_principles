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
        switch (size.toLowerCase()) {
            case "big":
                damage *= 3;
                break;
            case "giant":
                damage *= 10;
                break;
        }
        System.out.println(name + " is attacking. It damaged \"" + damage + "\"" +
                "\n" + (hasSpike ? "Animal had spikes, the attack was critical" : "Animal didn't have spikes, the attack was not critical"));

        return damage;
    }

    public double attack(String mood) {
        double damage = weight * height;
        switch (size.toLowerCase()) {
            case "big":
                damage *= 3;
                break;
            case "giant":
                damage *= 10;
                break;
        }

        switch (mood.toLowerCase()){
            case "chill":
            case "calm":
            case "happy":
                System.out.println(name + " is in a good mood attacks less!");
                damage /= 2;
                break;
            case "angry":
            case "hungry":
                System.out.println(name + " is in a bad mood attacks more!");
                damage *= 2;
                break;
        }
        System.out.println(name + " is attacking. It damaged \"" + damage + "\"" +
                "\n" + (hasSpike ? "Animal had spikes, the attack was critical" : "Animal didn't have spikes, the attack was not critical"));

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
        dinosaur.attack("angry");
        dinosaur.setGender("Female");
        System.out.println(dinosaur.getGender("12345"));
    }
}
