package running40;
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class num11 {
     public int solution(long num) {
          int cnt = 0;
          while(num != 1 && cnt <= 500){
               if(num %2 ==0){
                    num /= 2;
               }else {
                    num = num * 3 + 1;
               }
               cnt++;
          }
          return (num==1) ? cnt : -1 ;
     }
     
     public static void main(String[] args) {
          num11 test = new num11();
          System.out.println(test.solution(626331));
     }
}
