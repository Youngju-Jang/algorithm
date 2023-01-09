import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] babbling) {
          Set<String> ans = new HashSet<>();
          String[] base = {"aya", "ye", "woo", "ma"};
          
          for (int a = 0; a < 4; a++) {
               ans.add(base[a]);
               for (int b = 0; b < 4; b++) {
                    if (a == b) continue;
                    ans.add(base[a] + base[b]);
                    for (int c = 0; c < 4; c++) {
                         if (c == a || c == b) continue;
                         ans.add(base[a] + base[b] + base[c]);
                         for (int d = 0; d < 4; d++) {
                              if (d == a || d == b || d == c) continue;
                              ans.add(base[a] + base[b] + base[c] + base[d]);
                         }
                    }
               }
          }
          int answer = 0;
          for (String st : babbling) {
               if (ans.contains(st)) {
                    answer++;
               }
          }
          return answer;
     }
}