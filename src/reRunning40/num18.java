package reRunning40;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class num18 {
     public static int[] solution(int[] answers) {
          int[] num1 = {1, 2, 3, 4, 5}; // 5
          int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8
          int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
          int[] cntArr = new int[3];
          for(int i=0; i<answers.length; i++){
               if(answers[i] == num1[i%5]) cntArr[0]++;
               if(answers[i] == num2[i%8]) cntArr[1]++;
               if(answers[i] == num3[i%10]) cntArr[2]++;
          }
          int max = Math.max((Math.max(cntArr[0],cntArr[1])),cntArr[2]);
          ArrayList<Integer> ansArr = new ArrayList<>();
          for(int i=0; i<3; i++){
               if(max == cntArr[i]){
                    ansArr.add(i+1);
               }
          }
          return ansArr.stream().mapToInt(i->(int)i).toArray();
     }
     
     public static void main(String[] args) {
          System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
     }
}
