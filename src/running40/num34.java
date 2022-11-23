package running40;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class num34 {
     public int solution(int[] nums) {
          int[] arr = Arrays.stream(nums).distinct().toArray(); // 중복제거
          int chooseNum = nums.length /2;
          if(chooseNum >= arr.length){
               return arr.length;
          }else {
               return chooseNum;
          }
     }
     
     public static void main(String[] args) {
          num34 test = new num34();
          test.solution(new int[]{3,3,3,2,2,4});
     }
     
}
