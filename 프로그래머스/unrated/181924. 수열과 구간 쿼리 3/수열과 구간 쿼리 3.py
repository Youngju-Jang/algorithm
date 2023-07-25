def solution(arr, queries):
    for ar in queries:
        swap_elements(arr, ar[0], ar[1])
    return arr

def swap_elements(arr, idx1, idx2):
    arr[idx1], arr[idx2] = arr[idx2], arr[idx1]