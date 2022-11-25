package reRunning40;

// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class num24 {
     public static String solution(String new_id) {
          // 1,2,3단계
          String ans = new_id.toLowerCase()
               .replaceAll("[^0-9a-z\\-\\_\\.]", "")
               .replaceAll("\\.\\.+", ".");
          // 4단계
          if (ans.charAt(0) == '.') ans = ans.substring(1);
          if (ans.length() == 0) ans = "a";
          ans = ans.replaceAll("\\.$", "");
          
          //5단계
          if (ans.length() == 0) ans = "a";
          // 6단계
          if (ans.length() >= 16) {
               ans = ans.substring(0, 15);
               ans = ans.replaceAll("\\.$", "");
          }
          // 7단계
          if (ans.length() < 3) {
               while (ans.length() < 3) {
                    ans += ans.charAt(ans.length() - 1);
               }
          }
          return ans;
     }
     
     public static void main(String[] args) {
          System.out.println(num24.solution("-.~!@#$%&*()=+[{]}:?,<>/.-"));
          System.out.println("1234".substring(0, 3));
          System.out.println("1234".charAt(3));
          System.out.println("..123.45.".replaceAll("\\.$", ""));
     }
}
