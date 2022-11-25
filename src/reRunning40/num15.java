package reRunning40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num15 {
     public static int[] solution(int[] arr) {
          ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(arr[0]));
          for(int i=1; i<arr.length; i++){
               if(arr[i-1]==arr[i]){
                    continue;
               }else{
                    ans.add(arr[i]);
               }
          }
          return ans.stream().mapToInt(i->i).toArray();
     }
     
     public static void main(String[] args) {
          
          System.out.println(Arrays.toString(num15.solution(new int[]{1,1,3,3,0,1,1})));
     }
}
