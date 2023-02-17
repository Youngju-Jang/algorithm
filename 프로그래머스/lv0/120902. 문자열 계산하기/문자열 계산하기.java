class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String pm = "plus";
        String[] lst = my_string.split(" ");
        for(String ch : lst){
            if(ch.equals("+")){
                pm = "plus";
            }else if(ch.equals("-")){
                pm = "minus";
            }else{
                if(pm.equals("plus")){
                    answer += Integer.parseInt(ch);
                }else{
                    answer -= Integer.parseInt(ch);
                }
            }
        }
        return answer;
    }
}