package reRunning40;

import java.util.Arrays;
import java.util.Collections;

public class num8 {
     public long solution(long n) {
          String[] strArr = String.valueOf(n).split("");
          Arrays.sort(strArr, Collections.reverseOrder());
          return Long.parseLong(String.join("", strArr));
     }
}
