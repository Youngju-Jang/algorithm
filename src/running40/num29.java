package running40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class num29 {
     static int index = 0;
     public int[] solution(int[] array, int[][] commands) {
          //i~j번째까지 자르고 > 정렬 >
          int[] answer = new int[commands.length];
          int index=0;
          ArrayList<Integer> temp = new ArrayList<>();
          for(int[] arr : commands){
               temp.clear();
               for(int i=arr[0]-1; i<arr[1]; i++){
                    temp.add(array[i]);
               }
               temp.sort(Comparator.naturalOrder());
               answer[index++] = temp.get(arr[2]-1);
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num29 test = new num29();
          
          System.out.println(Arrays.toString(test.solution(new int[]{1, 5,1,1,1,1, 2,1,1,1,1,1,1,1,1,1,1, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
     }
     // 그래도 Arrays.sort 보단 Collections.sort가 보통은 효과좋다함
     // 다른사람 코드
     //for(int i=0; i<commands.length; i++){
     //            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
     //            Arrays.sort(temp);
     //            answer[i] = temp[commands[i][2]-1];
     //        }
}


