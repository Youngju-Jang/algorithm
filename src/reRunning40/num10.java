package reRunning40;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class num10 {
     static int min;
     public static int[] solution(int[] arr) {
          min = arr[0];
          for(int i=0; i<arr.length; i++){
               if(min > arr[i]) min = arr[i];
          }
          int[] ans = Arrays.stream(arr).filter(i->i!=min).toArray();
          ans = (ans.length ==0) ? new int[]{-1} : ans;
          
          return ans;
     }
     
     public static void main(String[] args) {
          System.out.println(Arrays.toString(num10.solution(new int[]{10})));
     }
}
