package kennel;

public class Husky extends Dog {

    private int happiness;

    public Husky(String name) {
        super(name);
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    void feed() {
        this.happiness += 4;
    }

    @Override
    void play(int hours) {
        this.happiness += 3 * hours;
    }
}
