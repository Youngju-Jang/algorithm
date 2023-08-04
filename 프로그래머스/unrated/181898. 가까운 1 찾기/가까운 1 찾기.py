def solution(arr, idx):
    answer = -1;
    for i, n in enumerate(arr) :
        if i >= idx and n==1:
            answer = i;
            break 
    return answer