class Solution {
    public String[] solution(String my_str, int n) {
        int a = my_str.length()/n;
        boolean b = my_str.length()%n != 0;
        String[] answer = new String[a+(b? 1 : 0)];
        for(int i=0; i<a; i++){
            answer[i] = my_str.substring(i*n,(i+1)*n);
        }
        if(b){
            answer[a] = my_str.substring(a*n);
        }
        return answer;
    }
}