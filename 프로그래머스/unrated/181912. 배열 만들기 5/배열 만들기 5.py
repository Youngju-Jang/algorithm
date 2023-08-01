def solution(intStrs, k, s, l):
    answer = [int(i[s:s+l]) for i in intStrs]
    
    answer = list(filter(lambda x: x > k, answer))
    
    return answer