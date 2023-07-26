def solution(l, r):
    answer = [-1];
    arr = [int(str(bin(i))[2:]) * 5 for i in range(1, 64)]
    min, max = -1, -1;
    for i, n in enumerate(arr):
        if l > arr[-1] : 
            break;
        if n >= l:
            min = i;
            break;
    for i, n in reversed(list(enumerate(arr))):
        if r < arr[0] :
            break;
        if r >= n :
            print("max i = " , i, ", n : ", n);
            max = i;
            break;
    print(min, max)
    print("max:", max if max != -1 else null)
    if min > max :
        return answer
    if min != -1 and max == -1:
        return arr[min:]
    if min == -1 and max != -1:
        return arr[:max+1]
    if min != -1 and min != -1:
        return arr[min:max+1]
    return answer

# print(solution(555555, 1000000))
# print(solution(10, 20))