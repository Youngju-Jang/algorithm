def solution(a, b, c, d):
    cnt = {}
    answer = 0
    for n in [a,b,c,d]:
        cnt[n] = cnt.get(n,0) + 1
    arr = [i for i in cnt.keys()]
    if len(arr) == 1 :
        return 1111 * arr[0];
    if len(arr) == 2 :
        if cnt[arr[0]] == 2 :
            return (arr[0]+arr[1])*(abs(arr[0]-arr[1]))
        if cnt[arr[0]] == 3 :
            return (10 * arr[0] + arr[1])**2
        else :
            return (10 * arr[1] + arr[0])**2
    if len(arr) == 3: #2,1,1
        temp = list(filter(lambda x: cnt[x]!=2, arr))
        return temp[0] * temp[1]
    else :
        return min(arr)

    
    return answer