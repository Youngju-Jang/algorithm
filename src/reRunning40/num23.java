package reRunning40;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class num23 {
     public static String solution(String s, int n) {
          String ans = "";
          n %= 26;
          for (String ch : s.split("")) {
               if (ch.charAt(0) == 32) {
                    ans += ch;
               }else if(((ch.charAt(0) <= 90) &&(ch.charAt(0) + n - 'Z' <= 0)) ||
                    ((ch.charAt(0) >=97) && (ch.charAt(0) + n - 'z' <= 0) )){
                    ans += Character.toString(ch.charAt(0) + n);
               }else {
                         ans += Character.toString(ch.charAt(0) + n - 26);
               }
          }
          return ans;
     }
     
     
     public static void main(String[] args) {
          String test = "abc";
          System.out.println(num23.solution("a B z",4));
          char ca= 65;
          String result = "";
          System.out.println(result+ca);
     }
}
