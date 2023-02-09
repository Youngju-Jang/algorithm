class Solution {
    public String solution(String s, int n) {
          // n %= 26;
          // char[] sol = s.toCharArray();
          // char[] ans = new char[sol.length];
          // int index = 0;
          // for (char c : sol) {
          //     if(c == 32){
          //         ans[index] = 32;
          //     }
          //     if(65 <= c && c <=90 ){
          //         ans[index] = ((c+n-65)%26 + 65 );
          //     }
          //     if(97 <= c && c <=122){
          //         ans[index] = ((c+n-97)%26 + 97 );
          //     }
          //      index++;
          // }
          // return new String(ans);
        String ans = "";
          n %= 26;
          for (String ch : s.split("")) {
               if (ch.charAt(0) == 32) {
                    ans += ch;
               }
              else if(((ch.charAt(0) <= 90) &&(ch.charAt(0) + n - 'Z' <= 0)) ||
                    ((ch.charAt(0) >=97) && (ch.charAt(0) + n - 'z' <= 0) )){
                    ans += Character.toString(ch.charAt(0) + n);
               }else {
                         ans += Character.toString(ch.charAt(0) + n - 26);
               }
          }
          return ans;
     }
}