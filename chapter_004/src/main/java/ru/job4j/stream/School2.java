package ru.job4j.stream;

import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;

public class School2 {

    public Map<String, Student> collectToMap(List<Student> students) {
        return students.stream()
                .collect(toMap(
                        Student::getSurname,
                        student -> student,
                        (existing, replacement) -> existing));
    }
}
