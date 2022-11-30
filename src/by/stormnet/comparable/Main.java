package by.stormnet.comparable;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("Tom", 24));
        persons.add(new Person("Jonson", 36));
        persons.add(new Person("Nick", 45));

        for(Person person : persons) {
            System.out.println(person);
        }

        Person tom = new Person("Tom", 24);
        Person nick = new Person("Nick", 45);
    }
}
