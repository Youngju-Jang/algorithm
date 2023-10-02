def solution(s):
    arr = ''
    chk = '';
    for ch in s:
        if ch in arr : 
            chk = chk + ch
            arr = arr.replace(ch, "");
        else : 
            if ch not in chk:
                arr = arr + ch
    return ''.join(sorted(arr))	