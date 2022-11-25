package reRunning40;
//https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class num7 {
     public int[] solution(long n) {
          StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
          int[] ans = new int[sb.length()];
          int index = 0;
          for(String s : sb.toString().split("")){
               ans[index] = Integer.parseInt(s);
               index++;
          }
          return ans;
     }
     
     public static void main(String[] args) {
          num7 test = new num7();
          System.out.println(test.solution(12345));
     }
}
