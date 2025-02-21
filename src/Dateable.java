import java.util.Scanner;
public class Dateable {
  public static void main(String[] args) {
      // Write your code below, inside the main method.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter you age:");
    int age1 = scanner.nextInt();
    int age2 = (7+(age1/2));
    System.out.println(age1+"-years olds should date somebody who is at least "+age2+" years old.");

  }

}
