package running40;

import java.util.Arrays;

public class num2 {
     // https://school.programmers.co.kr/learn/courses/30/lessons/12910
     
     public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
     }
     
     public static void main(String[] args) {
          num2 test = new num2();
          int[] answer = test.solution(new int[] {5, 9, 7, 10}, 5);
          System.out.println(Arrays.toString(answer));
     }
}
