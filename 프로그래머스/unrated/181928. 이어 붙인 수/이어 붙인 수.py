def solution(num_list):
    answer = 0
    even = ''.join(map(str,[even for even in num_list if even%2 == 0]));
    odd = ''.join(map(str,[even for even in num_list if even%2 == 1]));
    return int(even) + int(odd)