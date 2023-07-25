def solution(arr, queries):
    answer = []
    for q in queries:
        new = arr[q[0]:q[1]+1]
        min = 1000001;
        for n in new:
            if n > q[2] and n < min:
                min = n;
        answer.append(min if min != 1000001 else -1)
    
    
    return answer