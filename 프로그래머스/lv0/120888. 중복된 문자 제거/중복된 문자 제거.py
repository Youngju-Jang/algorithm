def solution(my_string):
    tmp = set();
    answer = '';
    for i in my_string:
        if i not in tmp:
            answer += i;
        tmp.add(i)
    return answer 