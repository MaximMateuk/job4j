package ru.job4j.lambda.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combineName = person -> person.getName().equals(key);
        Predicate<Person> combineSurname = person -> person.getName().equals(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combineName.or(combineSurname).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
