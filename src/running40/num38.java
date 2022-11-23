package running40;

import java.util.Arrays;

public class num38 {
     //https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
     public String solution(String s) {
          int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
          String answer = arr[0] + " " + arr[arr.length-1];
          return answer;
     }
}
