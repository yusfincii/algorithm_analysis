
def selection_sort(listX):
    for i in range(0, len(listX)-2):
        minx = i+1
        for k in range(i, len(listX)-1):
            if listX[minx] > listX[k]:
                minx = k
        tmp = listX[i]
        listX[i] = listX[minx]
        listX[minx] = tmp

    return listX

    # Time Complexity : O(n^2)


test_list = [1, 11, 2, 39, 88, 67, 9, 29, 38, 71, 99]
print(selection_sort(test_list))
