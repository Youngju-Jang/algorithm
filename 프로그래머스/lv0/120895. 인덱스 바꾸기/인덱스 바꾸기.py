def solution(my_string, num1, num2):
    stList = list(my_string)
    stList[num1], stList[num2] = stList[num2], stList[num1]
    return ''.join(stList)