
class Solution {
   public int[] solution(String s) {
          int[] arr = new int[26]; // 0~25  : 1부터 채움
          int[] answer = new int[s.length()];
          
          for(int i=0; i<s.length(); i++){
               int index = arr[s.charAt(i)-97];
               answer[i] = (index == 0) ? -1 : (i - index + 1);
               arr[s.charAt(i)-97] = i+1;
          }
          return answer;
     }
}