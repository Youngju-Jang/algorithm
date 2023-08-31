def solution(n):
    arr = [1];
    for i in range(1, 11):
        arr.append(arr[i-1]*i)
    for item in range(len(arr)-1, 0, -1):
        if n >= arr[item]:
            return item
    return 0