import java.util.Scanner;
public class input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Age: ");
    int age = sc.nextInt();
    System.out.println(age);

    // taking string input
    System.out.println("Enter your first name: ");
    String name = sc.next();
    System.out.println(name);

    //taking complete sentence
    System.out.println("enter full name: ");
    String fullname = sc.nextLine();
    System.out.println(fullname);
  }
}
