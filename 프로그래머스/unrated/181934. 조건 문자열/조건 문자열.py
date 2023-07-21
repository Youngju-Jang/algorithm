def solution(ineq, eq, n, m):
    if eq == '=' and n==m:
        return 1;
    if ineq == '<' :
        return (n<m) + 0
    else :
        return (n>m) + 0
