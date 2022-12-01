import java.util.Scanner;
// Dog walker
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How much does your dog weigh?");
    double w = input.nextDouble();
    System.out.println("How old is your dog?");
    int a = input.nextInt();
    System.out.println("How far did you walk? (miles)");
    double mi = input.nextDouble();
    Dog d = new Dog(w, a);
    System.out.println(d.exercise(mi));
    input.close();
  }
}