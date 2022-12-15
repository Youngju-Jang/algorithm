package lev0;

public class num120808 {
     public int[] solution(int denum1, int num1, int denum2, int num2) {
          int dn3 = denum1 * num2 + denum2 * num1;
          int n3 = num1 * num2;
          for(int i=2; i<=Math.min(dn3, n3); i++){
               if(dn3%i==0 && n3%i==0){
                    dn3 /= i;
                    n3 /= i;
                    i--;
               }
          }
          int[] answer = {dn3, n3};
          return answer;
     }
}
