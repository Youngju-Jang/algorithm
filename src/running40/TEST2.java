package running40;

public class TEST2 {
     public int solution(int[] arr1, int[] arr2) {
          int answer = 0;
          for(int i=0; i<7; i++){
               if(arr2[i] >= 29) arr2[i] = 21;
               answer += arr2[i] - arr1[i];
          }
          
          return answer;
     }
     
     public static void main(String[] args) {
          TEST2 method = new TEST2();
          int[] arr1 = {9, 7, 8, 9, 7, 9, 8};
          int[] arr2 = {23, 22, 26, 26, 29, 27, 22};
          System.out.println(method.solution(arr1, arr2));
     }
}
