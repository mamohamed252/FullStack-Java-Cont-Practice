package examples;

import java.util.Scanner;

public class Operators {

/*
 * Given the meal price (base cost of a meal), tip percent (the percentage of 
 * the meal price being added as tip), and tax percent (the percentage of the meal 
 * price being added as tax) for a meal, find and print the meal's total cost. 
 * Round the result to the nearest integer.
Example
A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.

Function Description
Complete the solve function in the editor below.

solve has the following parameters:
int meal_cost: the cost of food before tip and tax
int tip_percent: the tip percentage
int tax_percent: the tax percentage
Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.
 */
	 // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip = (tip_percent * meal_cost)/100;
        double tax = (tax_percent * meal_cost)/100;
        double totalCost = meal_cost + tip + tax; 
        
        System.out.println((int)(Math.round(totalCost)));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
