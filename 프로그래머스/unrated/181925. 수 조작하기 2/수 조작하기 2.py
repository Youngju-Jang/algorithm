def solution(numLog):
    dic = dict(zip([1, -1, 10, -10], ["w", "s", "d", "a"]));
    answer = ''
    pre = numLog[0]
    for i in range(1,len(numLog)):
        answer += dic[numLog[i]-numLog[i-1]];
    
    return answer