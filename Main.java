package com.task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Asha", "Sumi", "Amrith", "Guna", "Aarthi", "Rithi", "Archana", "Bharath", "Angel", "Bhavi");

        // Filtering students whose names start with "A"
        List<String> studentsStartingWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Printing the filtered students
        System.out.println("Students whose names start with 'A':");
        studentsStartingWithA.forEach(System.out::println);
    }
}
// 3. You are a teacher in school In your class there are 10 students, you have decided to give special gifts to those students whose names start with "A" you are asked to separate those students with the help of a java program.
// Requirement:
// Use List interface to store the student name
// Use a lambda expression and the Stream API to filter the students