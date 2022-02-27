package kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        dogs.stream()
                .forEach(dog -> dog.feed());
    }

    public Dog findByName(String name) {
        return dogs.stream()
                .filter(dog -> name.equals(dog.getName()))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Cannot find dog"));
    }

    public void playWith(String name, int hours) {
        dogs.stream()
                .filter(dog -> name.equals(dog.getName()))
                .forEach(dog -> dog.play(hours));
    }

    public List<String> getHappyDogNames(int minHappiness) {
        return dogs.stream()
                .filter(dog -> dog.getHappiness() > minHappiness)
                .map(Dog::getName)
                .toList();
    }
}
