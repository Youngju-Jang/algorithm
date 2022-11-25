package reRunning40;

public class num25 {
     public static int solution(int left, int right) {
          int result = 0;
          for(int num=left; num<=right; num++){
               result = (count_yak(num) %2 ==0)?  result+num : result-num ;
          }
          return result;
     }
     
     public static int count_yak(int num){
          int result = 0;
          for(int i=1; i<num/i+1; i++){
               if(num%i ==0) result += 2;
          }
          if(Math.sqrt(num) == (int)Math.sqrt(num)) result--;
          return result;
     }
     
     public static void main(String[] args) {
          System.out.println(num25.solution(24, 27));
     }
}
