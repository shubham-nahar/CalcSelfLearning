package com.sapient.learning;

import java.util.Scanner;

/**
 * 
 * @author Shubham Nahar
 *         Hello world!
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        String input1 = scan.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.println("Enter a numeric value: ");
        String input2 = scan.nextLine();
        double d2 = Double.parseDouble(input2);

        double res = d1 + d2;

        System.out.println("The answer is " + res);
    }
}