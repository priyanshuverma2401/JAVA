import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
  public static int partition(int[] arr, int low, int high){
    int pivot = low;
    int i =low;
    int j = high;
    while(i<j){
      while((arr[i] <= arr[pivot]) && i < high){
        i++;
      }
    while((arr[j] > arr[pivot]) && j >= low){
      j--;
    }
    if(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    int temp = arr[pivot];
    arr[pivot] = arr[j];
    arr[j] = temp;
    }
    return j;

  }

  public static void QS(int[] arr,int low, int high){
    if (low < high){
      int partition = partition(arr,low,high);
      QS(arr,low,partition-1);
      QS(arr,partition+1,high);
    }
  }
  public static void main(String[] args){
    System.out.print("Enter total number of element you want to insert in the array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for( int i = 0; i<n ;i++){
      System.out.println("enter element "+(i+1));
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    QS(arr,0,(n-1));
    System.out.println(Arrays.toString(arr));
  }
}
