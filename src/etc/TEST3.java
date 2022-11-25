package etc;

import java.util.Arrays;

public class TEST3 {
     public String solution(String s) {
          // 정렬부터 해야함
          int[] intArr = Arrays.stream(s.split(" ")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
          String answer = "";
          
          for(int i=0; i<intArr.length; i++){
               // 소수아닌수 중 최소값
               if(!is_Prime(intArr[i])){
                    answer += intArr[i]+" ";
                    break;
               }
          }
          for(int i=intArr.length-1; i>=0; i--){
               // 소수의 최대값
               if(is_Prime(intArr[i])){
                    answer += intArr[i];
                    break;
               }
          }
          return answer;
     }
     
     public boolean is_Prime(int num){
          if(num ==2) return true; // 2 먼저 거르기
          if(num%2 ==0 || num == 1) return false; // 짝수 거르기
          
          for(int i=3; i<num/i+1; i += 2){
               if(num%i ==0) return false;
          }
          return true;
     }
     
     public static void main(String[] args) {
          TEST3 method = new TEST3();
          String s = "2 3 4 5";
          System.out.println(method.is_Prime(73));
          System.out.println(method.solution(s));
     }
}
