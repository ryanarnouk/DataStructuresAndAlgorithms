# Insertion Sort
1 2 4 5 **3** 6

1 2 4 **3** 5 6

1 2 **3** 4 5 6

Go through array comparing elements and replacing them if less than to sort through the array step by step 

![A gif of selection sort](https://raw.githubusercontent.com/Azbo400/DataStructuresAndAlgorithms/master/Insertion%20Sort/Insertion-sort-example.gif)

## Pseudo Code
```
function(array) {
  int n = array.length
  for i = 1 to n - 1 {
    int value = array[i]
    int j = i - 1
    while (i >= 0 and array[i] > key) {
      array[i + 1] = array[i]
      i = i - 1
    }
    array[i + 1] = key
  }
}
```