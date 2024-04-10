package com.task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToUpper {
    public static void main(String[] args) {
        // Given list of strings
        Stream<String> namesStream = Stream.of("aBc", "D", "eF");
        
        // Convert list of strings to uppercase using map()
        List<String> uppercaseList = namesStream.map(String::toUpperCase)
                                                .collect(Collectors.toList());
        
        // Print the uppercase list
        System.out.println("Uppercase List: " + uppercaseList);
    }
}
// 1. Write a program using map() method, to convert a list of Strings into uppercase. If the given List is: Stream names Stream.of("aBc", "d", "ef");