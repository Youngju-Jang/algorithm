class Solution {
    public int solution(int order) {
          int answer = 0;
          for(String s : String.valueOf(order).split("")){
               if(Integer.parseInt(s)==0) continue;
               if(Integer.parseInt(s)%3 ==0){
                    answer++;
               }
          }
          return answer;
     }
}