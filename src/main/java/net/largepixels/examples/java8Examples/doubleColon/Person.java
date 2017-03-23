package net.largepixels.examples.java8Examples.doubleColon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnminchuk on 3/23/16.
 */
public class Person {
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {

        return "name = "+name+" age = "+age;
    }

    public static List<Person> getPeople() {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setAge(20);
        p1.setName("abc");

        p2.setAge(25);
        p2.setName("xyz");

        p3.setAge(15);
        p3.setName("def");

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        return people;
    }

}