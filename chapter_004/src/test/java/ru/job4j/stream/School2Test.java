package ru.job4j.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class School2Test {

    private List<Student> students = new ArrayList<>();

    @Before
    public void init() {
        students.add(new Student(10, "Surname1"));
        students.add(new Student(90, "duplicate"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(90, "duplicate"));
        students.add(new Student(50, "duplicate"));
        students.add(new Student(60, "Surname6"));
        students.add(new Student(70, "Surname7"));
        students.add(new Student(90, "duplicate"));
    }

    @Test
    public void shouldReturnMapOfStudents() {
        School2 school2 = new School2();
        Map<String, Student> actualResult = school2.collectToMap(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", new Student(10, "Surname1"));
        expected.put("duplicate", new Student(90, "duplicate"));
        expected.put("Surname3", new Student(30, "Surname3"));
        expected.put("Surname6", new Student(60, "Surname6"));
        expected.put("Surname7", new Student(70, "Surname7"));
        assertThat(actualResult, is(expected));
    }
}