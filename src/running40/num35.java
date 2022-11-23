package running40;

import java.util.Arrays;

public class num35 {
     //https://school.programmers.co.kr/learn/courses/30/lessons/17681
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
                    System.out.println(Integer.parseInt(num1ar[j]) + Integer.parseInt(num2ar[j]));
                    
                    if ((Integer.parseInt(num1ar[j]) + Integer.parseInt(num2ar[j])) >=1) {
                         answer[i] += "#";
                    }else{
                         answer[i] += " ";
                    }
               }
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num35 test = new num35();
          System.out.println(Arrays.toString(
               test.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})));
     }
}
