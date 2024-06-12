import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
  public static void merge(int[] arr, int start, int mid, int end){
    int length_left_subarray = (mid - start)+1;
    int length_right_subarray = (end-mid);
    int[] left_subarray = new int[length_left_subarray];   // temp array
    int[] right_subarray = new int[length_right_subarray];  //temp array
    for(int i =0;i < length_left_subarray;i++){ //copying data to temp array
      left_subarray[i] = arr[start+i];
    }
    for(int i =0; i<length_right_subarray;i++){  // copying data to temporary array
      right_subarray[i] = arr[mid+1+i];
    }
    int i = 0;
    int j = 0;
    int k = start;
    while(i < length_left_subarray && j < length_right_subarray){
      if(left_subarray[i] < right_subarray[j]){
        arr[k] = left_subarray[i];
        i++;
      }else{
        arr[k] = right_subarray[j];
        j++;
      }
      k++;
    }
    while(i<length_left_subarray){
      arr[k] = left_subarray[i];
      i++;
      k++;
    }
    while(j<length_right_subarray){
      arr[k] = right_subarray[j];
      j++;
      k++;
    }
 
  } 
  public static void MS(int[] arr, int start, int end){
    if(start < end){
      int mid = (start+end)/2;
      MS(arr,start,mid);
      MS(arr,mid+1,end);
      merge(arr,start,mid,end);
    }
  }
  public static void main(String[] args) {
    System.out.print("Enter the total number of element you want to enter in the array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i < n;i++){
      System.out.print("Enter the element "+(i+1));
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    MS(arr,0,(n-1));
    System.out.println(Arrays.toString(arr));
  }}

