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
        Predicate<Person> combineSurname = person -> person.getSurname().equals(key);
        Predicate<Person> combinePhone = person -> person.getPhone().equals(key);
        Predicate<Person> combineAddress = person -> person.getAddress().equals(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combineName.or(combineSurname).or(combinePhone).or(combineAddress).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
