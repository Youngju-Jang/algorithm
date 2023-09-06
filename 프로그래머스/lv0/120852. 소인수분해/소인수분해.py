def solution(n):
    answer = set()
    i = 2;
    while n > 1:
        if n%i == 0 :
            answer.add(i);
            n /= i;
        else :
            i += 1;
    
    return sorted(answer)