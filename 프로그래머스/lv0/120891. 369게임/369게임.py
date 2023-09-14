def solution(order):
    answer = 0
    for i in str(order):
        if int(i)==0 : continue;
        answer += 1 if int(i)%3==0 else 0

    return answer