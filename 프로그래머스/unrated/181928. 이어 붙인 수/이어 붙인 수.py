def solution(num_list):
    answer = 0
    even = ''.join([str(even) for even in num_list if even%2 == 0]);
    odd = ''.join([str(odd) for odd in num_list if odd%2 == 1]);
    return int(even) + int(odd)