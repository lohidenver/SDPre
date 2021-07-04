import java.util.Scanner;
public class Objective7Lab5 {

  public static void main(String[] args) {


    Scanner userInput = new Scanner(System.in);
    boolean mainLoop = true;

    int choice;
    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();




      choice = userInput.nextInt();


      switch(choice){

        case 1:
              System.out.println("Hello User");
              break;
        case 2:
              System.out.println("Apples, Bananas, Coconuts");
              break;
        case 3:
              System.out.println("Goodbye User");
              System.exit(0);
              break;
        default:
              System.out.println("Invalid Choice");
      }
    }
  }
}

//userInput.close()
