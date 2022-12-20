package lev0;

public class num120890 {
     public int solution(int[] array, int n) {
          int gap = 101;
          int answer = 300;
          for(int i : array){
               if(Math.abs(n-i) < gap){
                    gap = Math.abs(n-i);
                    answer = i;
               }else if(Math.abs(n-i) == gap){
                    answer = Math.min(answer, i);
               }
          }
          return answer;
     }
}
