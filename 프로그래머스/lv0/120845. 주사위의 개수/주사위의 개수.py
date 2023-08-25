def solution(box, n):
    answer = 1
    for i in box:
        answer *= int(i/n)
    return answer
