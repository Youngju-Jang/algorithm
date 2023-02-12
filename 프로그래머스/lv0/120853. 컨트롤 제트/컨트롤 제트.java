class Solution {
    public int solution(String s) {
          int answer = 0;
          String[] strs = s.split(" ");
          int temp = Integer.parseInt(strs[0]);
          for(String str : strs){
               if(!str.equals("Z")){
                    temp = Integer.parseInt(str);
                    answer += temp;
               }else{
                    answer -= temp;
               }
          }
          return answer;
     }
}