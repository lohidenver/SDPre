import java.util.*;
import java.util.Scanner;

class Objective9Labs5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;
    //double sum = findSum(num1, num2);
    //double average = findAverage(num1, num2);
    //double tax = calcTax(num1, num2);


    System.out.println("Please provide the first number");
    num1 = kb.nextInt();

    System.out.println("Please provide the second number");
    num2 = kb.nextInt();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
       case 1:
       double addNumbers = findSum(num1, num2);
       System.out.println("The sum of " + num1 + " and " + num2 + " is: " + addNumbers);
       break;

       case 2:
       double average = findAverage(num1, num2);
       System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);//findAverage();
       break;

       case 3:
       double taxAmount = calcTax(num1, num2);
       System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + taxAmount);
       break;

       case 4:
        System.exit(0);
       break;

       default:
        System.out.println("That is not a valid choice.");
       break;

     }
   }
		kb.close();
 
}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}


  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  /*
  * Solution for Part 4 goes here
  */

  //***********************************************
  public static double findAverage(double x, double y) {
    double avg = (x + y)/2;
    return avg;
    };
  //***********************************************
	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  /*
  * Solution for Part 5 goes here
  */

  //***********************************************
  public static double calcTax(double x, double y) {
      double tax = (x + y) * .0831;
      return tax;
      };
  //***********************************************
}
