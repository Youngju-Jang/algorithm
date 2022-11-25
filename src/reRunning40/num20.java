package reRunning40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class num20 {
     public String solution(String s) {
          
          String ans = Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining(""));
          return null;
     }
}
