package com.task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        // Given list of strings
        List<String> listStrings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");
        
        // Filter non-empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                                                  .filter(str -> !str.isEmpty())
                                                  .collect(Collectors.toList());
        
        // Print list of non-empty strings
        System.out.println("List with Non-empty Strings: " + nonEmptyStrings);
    }
}
// 2. Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings. If the given List is: Liststrings Arrays.asList("abc", "", "be", "efg", "abcd","", "jkl");