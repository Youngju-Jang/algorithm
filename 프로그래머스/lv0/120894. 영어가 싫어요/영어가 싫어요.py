def solution(numbers):
    answer = numbers
    lst = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    for idx, i in enumerate(lst):
        answer = answer.replace(i, str(idx))
    return int(answer)