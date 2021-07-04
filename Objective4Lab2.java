import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //int num1 = 0, num2 = 0, num3 = 0;
    //double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Adding 3 whole numbers\nWhat is the first whole number you want to add?");
    int num1 = keyboard.nextInt();
    System.out.println("What is the second whole number you want to add?");
    int num2 = keyboard.nextInt();
    System.out.println("What is the final whole number you want to add?");
    int num3 = keyboard.nextInt();
    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("\nAdding 3 decimal numbers\nWhat is the first decimal number you want to add?");
    double dub1 = keyboard.nextDouble();
    System.out.println("What is the second decimal number you want to add?");
    double dub2 = keyboard.nextDouble();
    System.out.println("What is the final decimal number you want to add?");
    double dub3 = keyboard.nextDouble();
    //TODO print the three ints and their sum.
    System.out.println("\nThe sum of the whole numbers " + num1 + " + " + num2 + " + " + num3 + " is " + (num1+num2+num3) +".");
    System.out.println("The sum of the decimal numbers " + dub1 + " + " + dub2 + " + " + dub3 + " is " + (dub1+dub2+dub3) + ".");
    //TODO print the three doubles and their sum.

  }
}
