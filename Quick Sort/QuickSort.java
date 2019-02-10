public class QuickSort {
  public int Partition(int[] a, int start, int end) {
    // set the pivot to the end at the index to start
    int pivot = a[end];
    int pIndex = start; 

    for (int i = start; i <= end - 1; i++) {
      // if i is less than the pivot switch
      if (a[i] <= pivot) {
        int temp = a[i];
        a[i] = a[pIndex];
        a[pIndex] = temp;        
        pIndex = pIndex + 1;
      }
    }
    // swap pIndex with end
    int temp = a[pIndex];
    a[pIndex] = a[end];
    a[end] = temp;
    return pIndex;
  }

  public void QuickSortAlgo(int[] a, int start, int end) {
    if (start >= end) return; // exit out of recursion
    int pIndex = Partition(a, start, end); // set pIndex to returned value from Partition
    // Use recursion moving end down and start forward
    QuickSortAlgo(a, start, pIndex - 1);
    QuickSortAlgo(a, pIndex + 1, end);
  }

  public void PrintArray(int[] arr) {
    int n = arr.length; 
    for(int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }

    System.out.println();
  }

  public static void main(String args[]) {
    int[] array = {3, 4, 2, 1, 5, 6, 8, 7};
    QuickSort a = new QuickSort();
    // start at last index
    a.QuickSortAlgo(array, 0, 7);
    a.PrintArray(array);
  }
}