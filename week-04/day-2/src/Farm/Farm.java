package Farm;

import Animal.Animal;

import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    int slots = 3;

    public void breed() {
        if (this.slots > 0) {
            animals.add(new Animal());
            slots--;
        }
    }

    public void slaughter() {
        int indexOfAnimal = 0;
        int animalHunger = animals.get(0).hunger;
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i).hunger < animalHunger) {
                indexOfAnimal = i;
                animalHunger = animals.get(i).hunger;
            }
        }
        animals.remove(indexOfAnimal);
    }

}
