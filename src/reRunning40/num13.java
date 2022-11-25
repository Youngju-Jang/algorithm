package reRunning40;
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class num13 {
     public static int solution(int n) {
          StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();
          return Integer.parseInt(sb.toString(),3);
     }
     
     public static void main(String[] args) {
          System.out.println(num13.solution(45));
     }
}
