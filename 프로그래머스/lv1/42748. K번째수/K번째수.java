import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
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
}