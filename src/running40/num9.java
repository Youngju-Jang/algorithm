package running40;
//https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class num9 {
     public long solution(long n) {
          double num = Math.sqrt(n);
          boolean isSqrt = num == (int)num;
          if(isSqrt){
               return (long)Math.pow(num+1, 2);
          }else {
               return -1;
          }
     }
     
     public static void main(String[] args) {
          num9 test = new num9();
          System.out.println(test.solution(121));
          
     }
     
     
}
