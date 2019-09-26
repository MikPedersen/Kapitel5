/*Write a program that lets the user enter the loan amount, number og years, and interest rate then
displays the amortization schedule for the loan.
Sample run : Loan amount 10000, Number of years 1, annual interest rate 7
Payment#  - Interest - Principal - Balance
1           58.33       806.93     9193.07
2           53.62       811.64     8381.43
..
12          5.01        860.25      0.01
 */
import java.util.Scanner;
import java.util.*;

public class Opgave22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double interest;
        double principal;
        double balance;

        System.out.println("Welcome to the amortization planner");
        System.out.println("Please enter loan amount");
        balance = input.nextDouble();
        System.out.println("Please enter number of years");
        int numberOfYears = input.nextInt();
        System.out.println("Please enter annual interest rate");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = balance * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        System.out.printf("%-10s%-10s%-10s%-10s \n","Payment#","Interest","Principal","Balance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest + "\t\t" + principal
                    + "\t\t" + balance);
        }
    }
}
