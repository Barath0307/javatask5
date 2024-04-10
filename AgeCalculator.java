package com.task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        // Parse input to LocalDate
        LocalDate birthdate = LocalDate.parse(input);

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Calculate age
        Period period = Period.between(birthdate, currentDate);

        // Output age
        System.out.println("Your age is: " + period.getYears() + " years, "
                + period.getMonths() + " months, and " + period.getDays() + " days.");

        scanner.close();
    }
}
// 4. Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age, you have to help him to build this app using the java.time.LocalDate class.
// Input:
// Enter your birthdate (yyyy-mm-dd): 1990-05-15
// Output:
// Your age is: 33 years, 4 months, and 13 days.