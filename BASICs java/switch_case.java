import java.util.Scanner;
public class switch_case {
  public static void main(String[] args){
    System.out.println("enter day number: ");
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch(day){
      case 1 :
        System.out.println("monday");
        break;
      case 2 :
        System.out.println("tuesday");
        break;
      default :
        System.out.println("invalid input");
    }
  }
}
