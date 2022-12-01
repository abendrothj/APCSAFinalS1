import java.util.Scanner;
class Dog {
  private int weight;
  private int age;
  public Dog(double w, int a) {
    age = a;
    weight = (int)w;
  }
  public String exercise(double mi) {
    boolean enough = false;
    while(!enough) {
      if(age >= 15 && mi >= 0.75) {
        enough = true;
        return "You walked far enough! Your dog thanks you.";
      }
      if((weight<25 && mi >= 0.75)||(weight < 50 && mi >= 1.25)||(weight < 75 && mi >= 2.0)||(weight<110&&mi>= 3.0)||(weight>150&&mi>4.5)) {
        enough = true;
        return "You walked far enough! Your dog thanks you.";
      } else {return "Keep walking that dog!";}
    } return "Invalid dog.";
  }
}