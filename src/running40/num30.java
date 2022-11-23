package running40;
// https://school.programmers.co.kr/learn/courses/30/lessons/87389
public class num30 {
     public int solution(int n) {
          
          for(int i=2; i<n; i++){
               if((n-1)%i == 0){
                    return i;
               }
          }
          int answer = 0;
          return answer;
     }
}
