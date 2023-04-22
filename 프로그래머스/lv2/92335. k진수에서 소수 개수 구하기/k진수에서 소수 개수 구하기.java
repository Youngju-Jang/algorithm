class Solution {
   public int solution(int n, int k) {
          int answer = 0;
          System.out.println(Integer.toString(n, k));
          String[] numArr = Integer.toString(n, k).split("0+");
          for(String num : numArr){
               answer += is_Prime(Long.parseLong(num))? 1 : 0;
          }
          return answer;
     }
     public boolean is_Prime(Long num){
          if(num ==2) return true; // 2 먼저 거르기
          if(num%2 ==0 || num == 1) return false; // 짝수 거르기
          
          for(int i=3; i<num/i+1; i += 2){
               if(num%i ==0) return false;
          }
          return true;
     }
}