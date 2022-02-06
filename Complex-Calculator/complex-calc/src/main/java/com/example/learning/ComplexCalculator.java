package com.example.learning;

import java.util.Scanner;

/**
 * @author Shubham Nahar
 *         Hello world!
 */
public class ComplexCalculator {
    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    private static String getInput(String str) {
        System.out.println(str);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String operation = getInput("Choose an operation( +, -, *, /): ");

        double res = 0;

        try {
            switch (operation) {
                case "+":
                    res = addValues(s1, s2);
                    break;
                case "-":
                    res = subtractValues(s1, s2);
                    break;
                case "*":
                    res = multiplyValues(s1, s2);
                    break;
                case "/":
                    res = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation");
                    return;
            }
            System.out.println("The answer is " + res);
        } catch (Exception e) {
            System.out.println(("Number formatting exception " + e.getMessage()));
        }

    }
}
