package running40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class num7 {
     public int[] solution(long n) {
          String[] arr = Long.toString(n).split("");
          int[] answer = new int[arr.length];
          int index = 1;
          for(String i : arr){
               answer[arr.length-index] = Integer.parseInt(i);
               index++;
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num7 test = new num7();
          System.out.println(Arrays.toString(test.solution(12345)));
          
     }
     
     // 다른사람코드
     //return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
     
     
}
