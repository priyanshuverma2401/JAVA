import java.util.Scanner;

public class number_guessing_game_mini_project {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int random_number = (int)(Math.random()*100);

    while(true){
      System.out.print("Enter number: ");
      int user_input = sc.nextInt();
      System.out.println("Your choosen number is: "+ user_input);
      if (user_input < 0){
        System.out.println("you've quit the game");
      }
      if(user_input < random_number){
        System.out.println("Your choice is less than origonal number.");
        continue;
      }else if(user_input > random_number){
        System.out.println("Your choice is larger than origional number.");
        continue;
      }else if(user_input == random_number){
        System.out.println("congratulations!!!! you have guessed correct number.");
        break;
      }
    }
  }
}
