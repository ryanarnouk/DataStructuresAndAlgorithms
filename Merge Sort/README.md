# Merge Sort
## How Merge Sort works
1. If one element in array is already sorted return.
2. Divide the list recursively into two halves until it can't be divided more.
3. Merge smaller lists into a new list in a sorted order.

Check out this animation for more detail: 

![Merge Sort Animation](https://github.com/Azbo400/DataStructuresAndAlgorithms/blob/master/Merge%20Sort/mergesort.gif?raw=true)

## Pseudo Code 
```
Merge Logic: 
Merge(left, right, a, leftlength, rightlength) {
  // merge the right and left arrays together
  i = 0, j = 0, k = 0;

  // iterate through arrays placing elements in correct order
  while(i < leftlength and j < rightlength) {
    if(left[i] <= right[j]) {
      a[k++] = left[i++];
    } else {
      a[k++] = right[j++];
    }
  }

  // copy any remaining left over items
  while (i < leftlength) {
    a[k++] = left[i++]
  }
  while (j < rightlength) {
    a[k++] = right[j++];
  }
}

MergeSort(a, n) {
  if(n < 2) return; // we are using recursion so we need to exit out of the function

  // split the array into left and right
  mid = n / 2;
  int[] left = new int[mid];
  int[] right = new int[n-mid];

  for (int i = 0; i < mid; i++) {
    left[i] = a[i]
  }
  for (int i = mid; i < n; i++) {
    right[i - mid] = a[i];
  }

  // Recursion
  // sort each half
  MergeSort(left, mid);
  MergeSort(right, n - mid);

  // merge the halves
  Merge(left, right, a, mid, n - mid);
}
```