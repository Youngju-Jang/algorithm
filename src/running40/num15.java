package running40;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class num15 {
     static int num1 = -1;
     public int[] solution(int []arr) {
          List<Integer> ans = new ArrayList<>();
          for (int i=0; i<arr.length; i++){
               if(num1 != -1  && num1 == arr[i]){
                    continue;
               }else {
                    num1 = arr[i];
                    ans.add(arr[i]);
               }
          }
          return ans.stream().mapToInt(Integer::intValue).toArray();
     }
     
     public static void main(String[] args) {
          num15 test = new num15();
          test.solution(new int[]{1,1,3,3,0,1,1});
          
     }
}
