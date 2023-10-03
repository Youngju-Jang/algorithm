class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            String tmp = Integer.toString(i);
            answer += tmp.length() - tmp.replace("7", "").length();
        }
        return answer;
    }
}