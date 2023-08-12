def solution(emergency):
	temp = sorted(emergency, reverse=True);
	answer = []
	for i in emergency:
		for idx, n in enumerate(temp):
			if i == n:
				answer.append(idx+1);
				break;   
	return answer