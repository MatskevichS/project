package by.stormnet.comparator;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        PersonComparator personComparator = new PersonComparator();
        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
        TreeSet<Person> persons = new TreeSet<>(personComparator.thenComparing(personAgeComparator));
//        TreeSet<Person> persons = new TreeSet<>(personAgeComparator);
        persons.add(new Person("Tom", 33));
        persons.add(new Person("Tom", 24));
        persons.add(new Person("Jonson", 45));
        persons.add(new Person("Adam", 36));

        for(Person person : persons) {
            System.out.println(person);
        }
    }
}
