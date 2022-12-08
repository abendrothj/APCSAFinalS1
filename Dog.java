/** Dog Class
 * @author Jake A
 * @version 1
 */
import java.util.Scanner;
class Dog {
  private int weight;
  private int age;

  /**
   * Object class with Constructor ✓, creates a dog instance
   * @param w weight in lbs
   * @param a age in years
   */
  public Dog(double w, int a) {
    age = a;
    weight = (int)w;
  }

  /**
   * Exercise method with loop and boolean operations
   * Checks if dog has been walked enough considering age, distance, and weight.
   * @param mi distance(miles)
   * @return if dog has been walked enough, or if the dog needs to keep walking.
   */
  public String exercise(double mi) { // Method with parameters ✓
    boolean enough = false;
    while(!enough) { // Iteration (loop) ✓
      if(age >= 15 && mi >= 0.75) {
        enough = true;
        return "You walked far enough! Your dog thanks you.";
      } // Advanced Conditionals below ✓
      if((weight<25 && mi >= 0.75)||(weight < 50 && mi >= 1.25)||(weight < 75 && mi >= 2.0)||(weight<110&&mi>= 3.0)||(weight>150&&mi>4.5)) {
        enough = true;
        return "You walked far enough! Your dog thanks you.";
      } else {return "Keep walking that dog!";}
    } return "Invalid dog.";
  }
}