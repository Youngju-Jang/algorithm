package running40;

public class num23 {
     // https://school.programmers.co.kr/learn/courses/30/lessons/12926
     // A~Z 반복, a~z 반복임 & n 25보다 큰거도 계산필요함
     public String solution(String s, int n) {
          n %= 26;
          char[] sol = s.toCharArray();
          char[] ans = new char[sol.length];
          int index = 0;
          for (char c : sol) {
               if(c == 32){
                    ans[index] = 32;
               }
               if(65 <= c && c <=90 ){
                    ans[index] = (char)((c+n-65)%26 + 65 );
               }
               if(97 <= c && c <=122){
                    ans[index] = (char)((c+n-97)%26 + 97 );
               }
               index++;
          }
          return new String(ans);
     }
     
     public static void main(String[] args) {
          num23 test = new num23();
          String ans = test.solution("AB",1);
          char c_data = ' ';
          byte b_data = 107;
          char c_convert = (char) b_data;
          byte b_convert = (byte) c_data;
          System.out.println(ans);
          System.out.println("  ".toCharArray().length);
          System.out.println((char)('z' + 1 - 26));
          System.out.println('a' == 97);
          
          
     }
}
