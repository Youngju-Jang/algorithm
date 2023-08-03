def solution(n, k):
    return [i*k for i in range(1, int(n/k)+1)]