# Quick Sort
1. After selecting an element as a pivot which is the last index of the array we divide the array into 2 sub arrays. This is called partitioning. 
2. Elements smaller than the pivot would be on the left side of the pivot and all the elements greater than the pivot would be on the right side. 
3. That leaves 2 problems, solving the segment of the array right of the pivot and sorting the segment of the array left of the pivot.
4. **Repeat** Break down each sub array and set sub-pivots. Use recursion to keep breaking down the array setting new pivots to continue sorting each segment of the array.  

![Quick Sort](https://github.com/Azbo400/DataStructuresAndAlgorithms/blob/master/Quick%20Sort/Quicksort-example.gif?raw=true)

## Pseudo Code
```
// Partitioning logic
Partition(array, start, end) 
  pivot = a[end]
  pIndex = start
  for i = start to end - 1
    swap array[i] a[pIndex]
    pIndex = pIndex - 1
  swap a[pIndex] a[end]
  return pIndex

// Quick Sort Function
QuickSort(array, start, end)
  if(start >= end) return // need to exit out of the function if one element is remaining
  QuickSort(array, start, pIndex - 1)
  QuickSort(array, pIndex + 1, end)

QuickSort(array, 0, 7)
```

#### Swap with Java
```
int temp = a[pIndex];
a[pIndex] = a[end];
a[end] = temp;
```