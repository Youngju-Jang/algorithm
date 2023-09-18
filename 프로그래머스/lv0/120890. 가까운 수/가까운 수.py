def solution(array, n):
    ans = 100
    for i in array:
        ans = i if abs(i-n) < abs(ans-n) else ans
        ans = min(i, ans) if abs(i-n) == abs(ans-n) else ans
    return ans