package net.largepixels.examples.java8Examples.doubleColon;

import java.util.Collections;
import java.util.List;

/**
 * Created by johnminchuk on 3/24/16.
 */
public class Main {

    public void lambdaSort() {

        List<Person> people = Person.getPeople();

        System.out.println("before sorting "+people);

        PersonSortByAge sortByAge = new PersonSortByAge();

        Collections.sort(people,(Person per1, Person per2) -> sortByAge.compare(per1, per2));

        System.out.println("after sorting " + people);

    }

    public void lambdaSortNoClass() {

        List<Person> people = Person.getPeople();

        System.out.println("before sorting " + people);

        PersonSortByAge sortByAge = new PersonSortByAge();

        Collections.sort(people, (Person per1, Person per2) -> per1.getAge() - per2.getAge());

        System.out.println("after sorting " + people);

    }

    public void doubleColonSort() {
        List<Person> people = Person.getPeople();

        System.out.println("before sorting " + people);

        PersonSortByAge sortByAge = new PersonSortByAge();

        Collections.sort(people, sortByAge::compare);

        System.out.println("after sorting " + people);

    }

    public void comparatorSort() {
        List<Person> people = Person.getPeople();

        System.out.println("before sorting " + people);

        PersonSortByAge sortByAge = new PersonSortByAge();

        Collections.sort(people, new PersonSortByAgeComparitor());

        System.out.println("after sorting " + people);

    }

    public static void main(String[] args) {
        Main main = new Main();

        main.comparatorSort();
        main.lambdaSort();
        main.lambdaSortNoClass();
        main.doubleColonSort();

    }
}
