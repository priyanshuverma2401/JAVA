import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
  public static void selection(int[] arr){
    int n = arr.length;
    for(int i = 0;i<n-1;i++){
      int mini = i;
      for(int j = i;j < n;j++){
        if(arr[j] < arr[mini]){
          mini = j;
        }
      }
      if(mini!=i){
        int temp = arr[i];
        arr[i] = arr[mini];
        arr[mini] = temp;
      }
    }
  }
  public static void main(String[] args){
    System.out.print("Enter the total number of element you want to insert: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<n;i++){
      System.out.print("enter element "+(i+1)+" : ");
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    selection(arr);
    System.out.println(Arrays.toString(arr));
  }
}
