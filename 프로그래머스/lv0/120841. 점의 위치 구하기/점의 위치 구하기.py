def solution(dot):
    x, y = dot
    if x > 0:
        answer = 1 if y > 0 else 4
    else:
        answer = 2 if y > 0 else 3        
    return answer ;