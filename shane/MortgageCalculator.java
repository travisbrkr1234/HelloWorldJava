package com.mortgagecalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		
		// This is a mortgage calculator that will display monthly rate.
		String name = "";
		double loan = 0.0;
		double interest = 0.0;
		int years = 0;
		
		// get input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = in.nextLine();
		System.out.print("Enter Loan Amount: ");
		loan = in.nextDouble();
		System.out.print("Enter Interest Rate: ");
		interest = in.nextDouble();
		System.out.print("Enter the number of Years: ");
		years = in.nextInt();
		
		// calculate monthly payment
		double monthlyInterest = (interest / 12.0) / 100.0;
		int months = years * 12;
		double term = Math.pow(1 + monthlyInterest, months);
		double payments = loan * (monthlyInterest * term) / (term -1);
		
		// close the input scanner to clear the memory
		in.close(); 
		
		// show output
		DecimalFormat fmt = new DecimalFormat("$#,##0.00");
		System.out.println( "Hello " + name + ", ");
		System.out.println( "Your montly payment will be: " + fmt.format(payments) );

	}

}
