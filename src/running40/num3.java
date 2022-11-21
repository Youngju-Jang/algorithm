package running40;

public class num3 {
     // https://school.programmers.co.kr/learn/courses/30/lessons/12922
     public String solution(int n) {
          String sb = "수박";
          String result = sb.repeat(n/2);
          return result += n%2 ==0 ? "" : "수" ;
          
          
     }
     
     public static void main(String[] args) {
          num3 test = new num3();
          System.out.println(test.solution(4));
          
     }
     
}

