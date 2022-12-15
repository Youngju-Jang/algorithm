package lev0;

public class num120887 {
     public int solution(int i, int j, int k) {
          int answer = 0;
          for (int x = i; x <= j; x++) {
               for (String s : String.valueOf(x).split("")) {
                    if (s.contains("" + k)) {
                         answer++;
                    }
                    ;
               }
          }
          return answer;
     }
}
