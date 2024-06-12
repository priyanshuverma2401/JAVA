
import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
  public static void insertionSort(int[] arr){
    int n = arr.length;
    for(int i = 0;i < n;i++){
      int j = i;
      while(j > 0 && arr[j-1] > arr[j]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("enter the total number of element in array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i < n;i++ ){
      System.out.print("enter element "+ (i+1) +" : ");
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
    
  }
}
