package reRunning40;

import java.util.Arrays;
// ========================================================================
public class num2 {
     public int[] solution(int[] arr, int divisor) {
          int[] ans = Arrays.stream(arr).filter(i -> i%divisor ==0).sorted().toArray();
          return (ans.length==0) ? new int[]{-1} : ans;
     }
}
