import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
          Set<Integer> ans = new HashSet<>();
          int j = 2;
          while (n > 1) {
               if (n % j == 0) {
                    ans.add(j);
                    n /= j;
               } else {
                    j++;
               }
          }
          return ans.stream().sorted().mapToInt(i -> i).toArray();
     }
}