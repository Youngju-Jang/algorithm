def solution(s):
    arr = s.split(" ")
    save = 0
    answer = 0
    for item in arr :
        if item == 'Z':
            answer -= save;
            continue;
        answer += int(item);        
        save = int(item);       
    
    return answer