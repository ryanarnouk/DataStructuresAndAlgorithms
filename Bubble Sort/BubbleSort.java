public class BubbleSort {
  void BubbleSortAlgo(int[] array) {
    int x = array.length;
    for (int i = 0; i < x - 1; i++) {
      for (int j = 0; j < x - i - 1; j++) {
        // lets check if it is greater
        if(array[j] > array[j + 1]) {
          // swap the values in the array
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
  }

  void PrintArray(int[] array) {
    int n = array.length;
    for(int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    BubbleSort a = new BubbleSort();
    int[] arr = {5, 1, 6, 2, 4, 3};
    // Print the unsorted array
    System.out.println("Unsorted Array: ");
    a.PrintArray(arr);
    // run the bubble sort algorithm
    a.BubbleSortAlgo(arr);
    // Now lets print out the sorted array
    System.out.println("Sorted Array: ");
    a.PrintArray(arr);
  }
}