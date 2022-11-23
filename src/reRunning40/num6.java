package reRunning40;

public class num6 {
     public int solution(int n) {
          int ans = 0;
          for(String ch: String.valueOf(n).split("")){
               ans += Integer.parseInt(ch);
          }
          return ans;
     }
}
