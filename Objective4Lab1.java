import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    /*
    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";
    */
    //TODO prompt the user to get input for all of the String variables.
    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();
    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();
    //TODO print the output formatted to look like the expected output using String concatenation.
    System.out.println("\nThanks." + "\n" + " \n" + "My name is " + fname + " " + lname + ".\n");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".\n" + "My favorite food is " + favoriteFood + ".\n" + "My favorite song is " + favoriteSong + ".\n");
  }
}
