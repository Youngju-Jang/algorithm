def solution(my_string, queries):
    answer = my_string
    for [s,e] in queries:       
        n = s-1
        if n < 0 :
            answer = answer[:s] + answer[e::-1] + answer[e+1:]
        else:
            answer = answer[:s] + answer[e:n:-1] + answer[e+1:]
    return answer
