class Solution {
    public int solution(int number, int limit, int power) {
          int answer = 0;
          for(int i=1; i<=number; i++){
               answer += (cnt_yac(i)>limit)? power : cnt_yac(i);
          }
          return answer;
     }
     
     public int cnt_yac(int number){
          int cnt = 0;
          for(int i=1; i*i <= number; i++){
               if(i*i == number) cnt++;
               else if(number%i ==0) cnt += 2;
          }
          return cnt;
     }
}