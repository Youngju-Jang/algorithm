def solution(rsp):
    case = {"2":"0", "0":"5","5":"2"};
    return ''.join([case[ch] for ch in rsp])