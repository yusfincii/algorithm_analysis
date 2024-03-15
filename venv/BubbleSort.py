def bubble_sort(listX):
    for i in range(0, len(listX)-2):
        for k in range(0, len(listX)-i-1):
            if listX[k] > listX[k+1]:
                # swap
                tmp = listX[i]
                listX[i] = listX[k]
                listX[k] = tmp
    return listX

    # Time Complexity : O(n^2)


# for testing
test_list = [1, 11, 2, 39, 88, 67, 9, 29, 38, 71, 99]
print(bubble_sort(test_list))