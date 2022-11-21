package running40;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class num10 {
     public int[] solution(int[] arr) {
          if(arr.length == 1) return new int[]{-1};
          int min = arr[0];
          int cnt = 0;
          for(int i=0; i<arr.length; i++){
               if(min > arr[i]){
                    min = arr[i];
                    cnt = 1;
               } else if (min == arr[i]) cnt++;
          }
          int[] answer = new int[arr.length-cnt];
          for(int i=0, j=0 ; i<arr.length-cnt;i++, j++){
               if(arr[i] == min) j++;
               answer[i] = arr[j];
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num10 test = new num10();
          System.out.println(Arrays.toString(test.solution(new int[]{10})));
     }
     
}
