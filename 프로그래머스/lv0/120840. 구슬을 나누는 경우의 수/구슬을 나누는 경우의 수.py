def solution(balls, share):
    return pac(balls)/(pac(balls-share)*pac(share));

def pac(n):
    result = 1;
    for item in range(1, n+1, 1):
        result *= item
    return result;