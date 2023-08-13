def solution(n):
    answer = 0
    half = n**(1/2)
    if(int(half) == half):
        half = int(half)
        answer += 1;
    else:
        half = int(half) +1
    for i in range(half-1,0,-1):
        if n%i == 0:
            answer += 2;
    return answer