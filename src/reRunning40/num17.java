package reRunning40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class num17 {
     // https://school.programmers.co.kr/learn/courses/30/lessons/77484
     // 첫번째가 더 성능좋음
     public static int[] solution(int[] lottos, int[] win_nums) {
          // 일치갯수 + 순위 = 7  // 일치0일경우 순위 6
          // 최저갯수 = 같은수
          // 최대갯수 = 같은수 + 0
          // 0만 있을수도 & 다 같을수도 있음
          int same = 0; // 0개~6개
          int zero = 0; // 0개~6개
          ArrayList<Integer> myArr = Arrays.stream(lottos).boxed().collect(Collectors.toCollection(ArrayList::new));
          for(int i : myArr){
               if(i==0) zero++;
               for(int win : win_nums){
                    if(i==win) same++;
               }
          }
          int[] ans = new int[]{(7-same-zero ==7)? 6 : 7-same-zero, (7-same ==7)? 6 : 7-same};
          return ans;
     }
     
     public static void main(String[] args) {
          num17.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
     }
}
