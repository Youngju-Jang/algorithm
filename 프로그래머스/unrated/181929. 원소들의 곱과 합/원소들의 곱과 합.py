def solution(num_list):
    gob = 1;
    hap = 0;
    for n in num_list:
        gob *= n;
        hap += n;
    return (gob < hap**2) * 1