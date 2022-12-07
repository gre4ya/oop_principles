package recap.abstraction;

public abstract class Creature {

    public Creature(String name, int legs, String breathingMethod, String reproducingMethod) {
        this.name = name;
        this.legs = legs;
        this.breathingMethod = breathingMethod;
        this.reproducingMethod = reproducingMethod;
    }

    public String name;
    public int legs;
    public String breathingMethod;
    public String reproducingMethod;

    public abstract void moving();

    public abstract void breathing();

    public abstract void reproducing();

    public void living(){
        System.out.println(name + " is living!");
    }



}
