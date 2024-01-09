package BinarySearch;


import java.util.Arrays;

public class Searching {
  public static void main(String[] args) {

    int arr[]={2,4,5,6,7,8,9};
    Arrays.sort(arr);
     System.out.println(binarySearch(arr, 7));


  }
  //----------------------------------------------------------------------------
  static int binarySearch(int arr[], int target) {

    int start = 0;
    int end = arr.length-1 ;
    
    while (start <= end) {
      //find the middle element -->
      int mid = start + (end - start) / 2;
      
      if (target <arr[mid] ) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return-1;
  }
  
}
