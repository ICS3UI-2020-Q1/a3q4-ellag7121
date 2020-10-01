import java.util.Scanner;
/**
 * ask user for # between 1-10, tell the user that number in written form
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for input
    Scanner input = new Scanner(System.in);

    //ask user for integer
    System.out.println("Please enter a positive integer:");
    int integer = input.nextInt(); //store it in a variable

    //check what number was inputted and return the number in written form, unless it is not in the range
    switch(integer){
      case 1: //if the number is 1
        System.out.println("one"); //tell user "one"
        break;
      case 2: //if the number is 2
        System.out.println("two"); //tell user "two"
        break;
      case 3: //if the number is 3
        System.out.println("three"); //tell user "three"
        break;
      case 4: //if the number is 4
        System.out.println("four"); //tell user "four"
        break;
      case 5: //if the number is 5
        System.out.println("five"); //tell user "five"
        break;
      case 6: //if the number is 6
        System.out.println("six"); //tell user "six"
        break;
      case 7: //if the number is 7
        System.out.println("seven"); //tell user "seven"
        break;
      case 8: //if the number is 8
        System.out.println("eight"); //tell user "eight"
        break;
      case 9: //if the number is 9
        System.out.println("nine"); //tell user "nine"
        break;
      case 10: //if the number is 10
        System.out.println("ten"); //tell user "ten"
        break;
      default: //if the number is not between 1-10
        System.out.println("not in the range");  //tell user "not in range"
    }
    
  }
}
