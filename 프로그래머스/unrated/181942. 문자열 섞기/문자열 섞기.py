def solution(str1, str2):
    answer = ''
    for i, s in enumerate(str1):
        answer += s;
        answer += str2[i:i+1];
    return answer