package utils;

import java.io.Console;

/**
 * This class contain calculateSleepTime method
 */
public class SleepCalculator {
    /**
     * Calculates how much you have slept of your life
     */
    public static void CalculateSleepTime() {
        Console c = System.console();

        System.out.println("How old are you? Give anwer in whole years: ");
        Double age = Double.parseDouble(c.readLine());
        if (age.isNaN() || age == null) {
            throw new IllegalArgumentException("Give age as an integer");
        }

        Double ageInDays = age * 365;
        Double ageInHours = ageInDays * 24;

        Double sleptTimeYears = 0.3333 * age;
        Double sleptTimeDays = 0.3333 * ageInDays;
        Double sleptTimeHours = 0.333 * ageInHours;

        System.out.println("Congratulations!");
        System.out.println("You have slept:");
        System.out.println(sleptTimeYears + " years");
        System.out.println(sleptTimeDays + " days");
        System.out.println(sleptTimeHours + " hours");
    }
}
