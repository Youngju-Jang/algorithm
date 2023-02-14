import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
          String base = "0".repeat(n);
          String[] answer = new String[n]; // n줄
          
          for(int i=0; i<n; i++){ // 1줄씩 ㄱ
               String num1 = base + Integer.toBinaryString(arr1[i]); // 00~~10101.. n자리 이진수
               String num2 = base + Integer.toBinaryString(arr2[i]);
               String[] num1ar = num1.substring(num1.length()-n,num1.length()).split("");
               String[] num2ar = num2.substring(num2.length()-n,num2.length()).split("");
               answer[i] = "";
               for(int j=0; j<n; j++){                    
                    if ((Integer.parseInt(num1ar[j]) + Integer.parseInt(num2ar[j])) >=1) {
                         answer[i] += "#";
                    }else{
                         answer[i] += " ";
                    }
               }
          }
          return answer;
     }
}