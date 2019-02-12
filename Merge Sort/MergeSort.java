public class MergeSort {
  public void Merge(int[] left, int[] right, int[] a, int leftlength, int rightlength) {
    int i = 0, j = 0, k = 0; 

    while (i < leftlength && j < rightlength) {
      if(left[i] <= right[j]) {
        a[k++] = left[i++];
      } else {
        a[k++] = right[j++];
      }
    }
    // copy any of the remaining elements
    while (i < leftlength) {
      a[k++] = left[i++];
    } 
    while (j < rightlength) {
      a[k++] = right[j++];
    }
  }

  public void MergeSortAlgo(int[] a, int n) {
    if(n < 2) return; // exit out of recursion

    // split the array into left and right
    int mid = n / 2;
    int[] left = new int[mid];
    int[] right = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      right[i - mid] = a[i];
    }

    // sort each half
    MergeSortAlgo(left, mid);
    MergeSortAlgo(right, n - mid);

    // merge the halves
    Merge(left, right, a, mid, n - mid);
  }

  // print the array
  public void PrintArray(int[] a) {
    int n = a.length;
    for(int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int[] array = {2, 4, 1, 6, 8, 5, 3, 7};
    MergeSortTest a = new MergeSortTest();
    a.MergeSortAlgo(array, array.length);
    a.PrintArray(array);
  }
}