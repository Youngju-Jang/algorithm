import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
          int[] xArr = new int[10];
          int[] yArr = new int[10];
          StringBuilder sb = new StringBuilder();
          for (char ch : X.toCharArray()) {
               xArr[ch - '0']++;
          }
          for (char ch : Y.toCharArray()) {
               yArr[ch - '0']++;
          }
          int[] ans = new int[10];
          for(int i=0; i<10; i++){
               ans[i] = Math.min(xArr[i], yArr[i]);
          }
          
          for(int i=9; i>=0; i--){
               sb.append(String.valueOf(i).repeat(ans[i]));
          }
          String answer = sb.toString();
          if(answer.equals("")){
               return "-1";
          }else if(answer.replaceAll("0","").equals("")){
               return "0";
          }else {
               return answer;
          }
     }
}