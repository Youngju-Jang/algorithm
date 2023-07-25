def solution(numLog):
    dic = dict(zip([1, -1, 10, -10], ["w", "s", "d", "a"]));
    answer = ''
    pre = numLog[0]
    for n in numLog :
        if pre == n : 
            continue
        answer += dic[n-pre];
        pre = n;
    
    return answer