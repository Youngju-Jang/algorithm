def solution(num_list):
    last = num_list[-1];
    llast = num_list[-2];
    num_list.append(last - llast if last > llast else last*2);    
    
    return num_list