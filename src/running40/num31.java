package running40;

public class num31 {
     public int solution(int n) {
          if(n==2) return 1;
          int cnt = 1; //2 포함
          for(int num=3; num<=n; num += 2){ // 홀수만보겠음
               if(is_prime(num)) cnt++;
          }
          return cnt;
     }
     boolean is_prime(int num){
          int cnt = 1;
          int end = num;
          for(int i=3; i<end; i +=2){
               if(num % i ==0) cnt++;
               end = num/i +1;
               if(cnt >=2) return false;
          }
          return true;
     }
     public static void main(String[] args) {
          
          num31 test = new num31();
          System.out.println(test.solution(17));
     }
     
}