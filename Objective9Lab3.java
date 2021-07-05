
public class Objective9Lab3 {
  public static void main(String[] args) {
    java.util.Scanner userInput = new java.util.Scanner(System.in);
    int choice;

    while(true){
      printMenu();
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
              System.out.println("Invalid Choice");//Your solution goes here******************

      }

    //scanner.close();

  }
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
    }
  }




/*public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){

      //Your solution goes here******************

    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
*/
