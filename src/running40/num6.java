package running40;

public class num6 {
     public int solution(int n) {
          int answer = 0;
          while(n/10 != 0){
               answer += n%10;
               n /= 10;
          }
          answer += n;
          return answer;
     }
     
     public static void main(String[] args) {
          num6 test = new num6();
          System.out.println(test.solution(123));
          
          
     }
}
