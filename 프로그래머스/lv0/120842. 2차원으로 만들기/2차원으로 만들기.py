import math

def solution(num_list, n):    
    l = len(num_list) #8
    mox = math.ceil(l/n)
    answer = [[0 for i in range(n)] for row in range(mox)]
    for i in range(mox):
        for j in range(n):
            if(n*i+j < l):
                answer[i][j] = num_list[n*i+j]
    
    return answer

          