import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
          int answer = 0;
          int[] sorted = Arrays.stream(score).sorted().toArray();
          for(int i=sorted.length-1; i>sorted.length%m -1; i-=m){
               int min = sorted[i];
               for(int j=0; j<m; j++){
                    min = Math.min(sorted[i - j], min);
               }
               answer += min * m;
          }
          return answer;
     }
}