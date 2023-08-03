def solution(my_string):
    answer = [0 for i in range(58)]# +6
    for ch in my_string:
        answer[ord(ch)-65] += 1
    return answer[:26] + answer[32:]