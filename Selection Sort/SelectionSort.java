public class SelectionSort {
  void FindMin(int[] arr) {
    // Problem in this code not executing properly
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if(arr[j] < arr[min]) {
          min = j;
        }
      }

      // swap the values
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  // this is to just print the array
  public void PrintArray(int[] a) {
    int n = a.length;
    for(int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
  }


  public static void main(String args[]) {
    int[] arr = {3, 4, 2, 1, 6, 8, 5, 7};
    SelectionSort a = new SelectionSort();
    System.out.println("Unsorted Array:");
    a.PrintArray(arr);
    System.out.println("Sorted Array:");
    a.FindMin(arr);
    a.PrintArray(arr);
  }
}