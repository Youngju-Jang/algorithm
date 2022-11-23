package running40;
public class num39 {
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
     public int solution(int n) {
          // a , a+1, a+2, ...  a+i
          // a:구해야함 // i:0, 1, .. 증가시키기
          // 2n = 2a*(i+1) + (i+1)*i >> 나머지 버림방지용으로 전체 *2했음 >> a 구하기
          // i 언제까지 증가? >> a가 1일때까지??
          int i = 0;
          int answer = 0;
          while(true){
               double a = (double)n/(i+1) - (double)i/2;
               if((int)a == a) answer++;
               if(a<=1) break;
               i++;
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num39 test = new num39();
          System.out.println(test.solution(15));
     }
}
