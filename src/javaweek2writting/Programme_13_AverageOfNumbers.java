package javaweek2writting;
/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.print("The average of " + a + " , " + b + " and " + c + " is : " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        scanner.close();
    }

}
