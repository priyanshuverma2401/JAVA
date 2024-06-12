
import java.util.Arrays;


public class arrays {
  public static void main(String[] args) {
      int[] marks = new int[3];
      marks[0] = 97;
      marks[1] = 98;
      marks[2] = 96;
      System.out.println(marks);
      System.out.println(marks[0]);

      //length
      System.out.println(marks.length);

      //sort array
      System.out.println(marks[0]);
      Arrays.sort(marks);
      System.out.println(marks[0]);

      //declare and initialize
      int[] score = {97,98,95};

      // 2d array
      int[][] score2 = {{97,96,94},{93,92,98}};
      System.out.println(score2[1][1]);

      

  }}

