package animals;

import heroes.Animal;

public class Chicken extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Pac pac!");
    }
}
