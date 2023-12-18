package javaAssignments;

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {

		// 1.program to find greatest number
		int x = 25;
		int y = 78;
		int z = 87;
		int p = 97;

		if (x > y && x > z && x > p) {
			System.out.println("25 is greatest");

		} else if (y > z && y > p) {
			System.out.println("78 is greatest");
		}

		else if (z > p) {
			System.out.println("z is greatest");
		} else {
			System.out.println("p is greatest");
		}

		// 2.program to test a number is positive or negitive
		int a = 35;
		int b = -11;
		if (a > 0) {
			System.out.println("a is a positive number");
		} else {
			System.out.println("a is a negative number");
		}
		if (b > 0) {
			System.out.println("b is a positive number");
		} else {
			System.out.println("b is a negative number");
		}

		// 3.program to find number is even or odd number
		int n = 3;
		if (n / 2 == 0) {
			System.out.println("n is a even number");
		} else {
			System.out.println("n is a odd number");
		}

		// 4.program to find given alphabet is a vowel or consonant

		char alphabet = 'z';
		switch (alphabet) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		default:
			System.out.println("this is a consonant");
			break;
		}

		// 5.program to run test cases in specific envinornment qa,stage,Dev,UAT,prod

		String test = "15154";
		switch (test) {
		case "QA":
			System.out.println("Running test cases in QA envinornment");
			break;
		case "stage":
			System.out.println("Running test cases in stage envinornment");
			break;
		case "Dev":
			System.out.println("Running test caes in Dev envinornment");
			break;
		case "UAT":
			System.out.println("Running test cases in UAT envinornment");
			break;
		case "prod":
			System.out.println("Running test cases in prod envinornment");
			break;
		default:
			System.out.println("Not a valid envinornment");
			break;

		}

		// 6.program to book a car using uber app car type-Mini,Suv,Premium,Sedan
		String car_type = "Mini";
		switch (car_type) {
		case "Mini":
			System.out.println("u booked a mini car from uber");
			break;
		case "Suv":
			System.out.println("u booked a SUV car from uber");
			break;
		case "Premium":
			System.out.println("u booked a premium car from uber");
			break;
		case "Sedan":
			System.out.println("u booked a sedan car from uber");
			break;
		default:
			System.out.println("please select the right car type");
			break;
		}

		// 7.program to luanch browser-chrome,safari,ie,firefox
		// using if else
		// String browser=

		
		//  Scanner input = new Scanner(System.in);
		 //System.out.print("Enter Browser Name:");
		  //String browser = input.nextLine().trim();
		  
      //using if else
		String browser = "safari";
		if (browser.equals("chrome")) {
			System.out.println("luanching chrome");
		} else if (browser.equals("safari")) {
			System.out.println("launching " + browser);
		} else {
			System.out.println("Not a valid browser " + browser);
		}
		
		//using switch case
		switch(browser) {
		case "chrome":
			System.out.println("launching chrome");
			break;
		case "Firefox":
			System.out.println("launching firefox");
			break;
		case "safari":
			System.out.println("launching safari");
			break;
		case "ie":
			System.out.println("luanching ie");
		     break;
		 default:
			 System.out.println("please enter valid browser" + browser);
			 break;
		}
		
		//8.program to print August Interest rate for types of loan-education,housing,car loan,personal 
		
		String LoanType = "Education loan";
		int salary = 100000;
		double InterestRate=9.9;

		switch (LoanType) {
		case "Car loan":
			InterestRate = 6.5;
			System.out.println("August Interest rate for " + LoanType + " is " + InterestRate + "%");
			break;

		case "Housing loan":
			if (salary < 35000) {
				System.out.println("Not Eligible for Housing loan");
				return;
			}
			
			InterestRate = 7.5;
			System.out.println("August Interest rate for " + LoanType + " is " + InterestRate + "%");
			break;

		case "Personal loan":
			InterestRate = 10.0;
			System.out.println("August Interest rate for " + LoanType + " is " + InterestRate + "%");
			break;

		case "Education loan":
			InterestRate = 8.0;
			System.out.println("August Interest rate for " + LoanType + " is " + InterestRate + "%");
			break;

		default:
			System.out.println("Invalid loan type");
			System.out.println("Default option....August Interest rate for " + LoanType + " is " + InterestRate + "%");
			break;
			
			
		}
	}

}
