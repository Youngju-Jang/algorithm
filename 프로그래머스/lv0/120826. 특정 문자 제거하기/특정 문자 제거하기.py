def solution(my_string, letter):
    return "".join(list(filter(lambda ch : not ch==letter, my_string)))