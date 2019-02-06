def BinarySort(a):
    x = len(a)
    for i in range(x - 1):
        for j in range(x - i - 1):
            if a[j] > a[j + 1]:
            # swap the values in the array
                temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
            
            
numberlist = [5, 1, 6, 2, 3, 4]    
print("Non Sorted List")
print(numberlist)
print("Sorted List")
BinarySort(numberlist)
print(numberlist)
