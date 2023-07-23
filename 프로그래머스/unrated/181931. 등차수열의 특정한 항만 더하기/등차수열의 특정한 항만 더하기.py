def solution(a, d, included):
    answer = 0
    for idx, val in enumerate(included):
        answer += (a + (d*idx)) * val;
    return answer