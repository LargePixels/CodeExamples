package net.largepixels.examples.generics.example2.animal;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class Cat extends Animal {
    public Cat(String name) {
        this.legs = 4;
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("meow!");
    }
}
