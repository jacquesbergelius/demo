import animal.*;
import animal.fishes.*;
import human.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Human> humans = new ArrayList<>();
        System.out.println(Animal.getAnimalCount() + " animals created");

        animals.add(new animal.Dog("Max", 16));
        animals.add(new animal.Dog("Donald", 17));
        animals.add(new Cat("Felix", 17));
        animals.add(new Cat("Marilyn", 3));

        humans.add(new Man("Enzio Benzino", 24));
        animal.fishes.Salmon salmon = new Salmon();

        //Collections.sort(animals);
        Comparator<Animal> ageComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getAge() - a2.getAge();
            }
        };
        Collections.sort(animals, ageComparator);
        //Collections.sort(animals);

        for (Animal animal : animals) {
            System.out.println("animal.Animal name: " + animal.getName() + " (" + animal.getAge() + ")");
            animal.sound();
            //animal.eat();
            //animal.sleep();
        }

        System.out.println(Animal.getAnimalCount() + " animals created");
    }
}
