package javaweek2writting;
/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
import java.util.Scanner;
public class Programme_5_Calculator {
    public static void addition(int a, int b){
    int result = a+ b;
        System.out.println("The addition of " + a + " and " + b + " is :  " + result);
    }
    public static int subtraction (int a, int b){
        return a-b;
    }
    public void multiplication (int a, int b){
    int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }
    public int divison(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter first number : ");
        int b = scanner.nextInt();

        addition(a,b);
        int sunResult = subtraction(a,b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + sunResult);
        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a, b);

        int divResult = obj.divison(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        scanner.close();

    }
}
