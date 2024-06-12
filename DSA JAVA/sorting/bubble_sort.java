
import java.util.Arrays;



public class bubble_sort{

  public static void bubbleSort(int[] arr){
    int n = arr.length;
    boolean didSwap;
    for(int i = n-1;i >=1;i--){
      didSwap = false;
      for(int j=0; j<i;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          didSwap = true;
        }
      }
      if(!didSwap) break;
    }
  }
  public static void main(String[] args) {
      int[] arr = {23,12,45,67,89,32,56,99};
      System.out.println(Arrays.toString(arr));
      bubbleSort(arr);
      System.out.println(Arrays.toString(arr));
  }}
