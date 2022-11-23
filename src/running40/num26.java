package running40;

//https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class num26 {
     public int solution(int n) {
          if(n==1) return 1;
          int j=n;
          int i=1;
          int answer = 0;
          while(i<j){
               if(n%i ==0){
                    answer += i;
                    if(i*i != n){
                         answer += n/i;
                    }
                    j = n/i;
               }
               i++;
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num26 test= new num26();
          test.solution(12);
     }
}
