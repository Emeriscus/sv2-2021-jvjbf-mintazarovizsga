package kennel;

public class Beagle extends Dog {

    private int happiness;

    public Beagle(String name) {
        super(name);
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    void feed() {
        this.happiness += 2;
    }

    @Override
    void play(int hours) {
        this.happiness += 2 * hours;
    }
}
