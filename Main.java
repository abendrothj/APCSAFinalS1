/**
 * Dog walking program (Turner final)
 * @author Jake A
 * @version 1.0
 * @since 2022-12-08
 */

import java.util.Scanner;
class Main {
  /**
   * Asks for user input, and returns if the dog has been walked enough or not.
   * Prints the output of Dog's exercise method
   */
  public static void main(String[] args) { // Main method ✓
    Scanner input = new Scanner(System.in);
    System.out.println("How much does your dog weigh?");
    double w = input.nextDouble(); // User input ✓
    System.out.println("How old is your dog?");
    int a = input.nextInt();
    System.out.println("How far did you walk? (miles)");
    double mi = input.nextDouble();
    Dog d = new Dog(w, a);
    System.out.println(d.exercise(mi)); // Program output ✓
    input.close();
  }
}