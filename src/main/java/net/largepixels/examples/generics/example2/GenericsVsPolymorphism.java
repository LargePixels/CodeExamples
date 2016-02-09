package net.largepixels.examples.generics.example2;

import net.largepixels.examples.generics.example2.animal.Animal;
import net.largepixels.examples.generics.example2.animal.Cat;
import net.largepixels.examples.generics.example2.animal.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class GenericsVsPolymorphism {

    private void runMe() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Fido"));
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Kitty"));
        animals.add(new Cat("Cosmo"));
        takeThings(animals);

        List<Dog> dogs = new ArrayList<>();
        animals.add(new Dog("Captain"));
        animals.add(new Dog("Marty"));
        //takeThings(dogs);                     //this will not compile!!!
                                                //if it did takeThings could add cats to a dogs only list

        takeThingsGeneric(animals);
        takeThingsGeneric(dogs);

        takeThingsGeneric2(animals);
        takeThingsGeneric2(dogs);

        takeThingsGeneric3(animals);
        takeThingsGeneric3(dogs);
    }

    public void takeThings(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public <T extends Animal> void takeThingsGeneric(List<T> list) {
        for (T animal : list) {
            animal.speak();
        }
    }

    //this is the wildcard way to declare it
    public void takeThingsGeneric2(List<? extends Animal> list) {
        //wildcard supposedly stops you from doing this
        //Animal d1 = new Dog("test");
        //list.add(d1);
        for (Animal animal : list) {
            animal.speak();
        }
    }

    //this is the wildcard way to declare it
    public void takeThingsGeneric3(List<?> list) {
        for (Object animal : list) {
            System.out.println(animal.getClass().getName());
            //animal.speak();
        }
    }

    public static void main(String args[]) {
        GenericsVsPolymorphism genericsVsPolymorphism = new GenericsVsPolymorphism();
        genericsVsPolymorphism.runMe();
    }

}
