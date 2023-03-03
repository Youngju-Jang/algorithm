import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
          int answer = 0;
          int[] sorted = Arrays.stream(score).sorted().toArray();
          for(int i=sorted.length; i>sorted.length%m; i-=m){
               answer += sorted[i-m] * m;
          }
          return answer;
     }
}