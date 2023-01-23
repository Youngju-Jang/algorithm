import java.util.Arrays;
class Solution {
     public int[] solution(int[] emergency) {
          int[] ori = emergency.clone();
          Arrays.sort(emergency);
          
          int[] answer = new int[emergency.length];
          for (int j=0; j<ori.length; j++) {
               for (int i = 0; i < emergency.length; i++) {
                    if(ori[j] == emergency[i]){
                         answer[j] = ori.length - i ;
                    }
               }
          }
          return answer;
     }
}