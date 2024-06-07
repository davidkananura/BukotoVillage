/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.bukotovillagebank;

/**
 *
 * @author DAVID'S-PC
 */
import java.util.Scanner;

public class InvestmentWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of members
        System.out.print("Enter the number of members: ");
        int numMembers = scanner.nextInt();

        // Input the interest rate and time frame
        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the time frame in years: ");
        int years = scanner.nextInt();

        int i = 1;
        // Loop through each member
        while (i <= numMembers) {
            System.out.print("Enter the principal amount for member " + i + ": ");
            double principal = scanner.nextDouble();

            // Calculate the value of investment
            double investmentValue = principal * Math.pow(1 + annualInterestRate, years);
            System.out.printf("The value of the investment after %d years for member %d is: %.2f%n", years, i, investmentValue);
            
            i++;
        }

        scanner.close();
    }
}
