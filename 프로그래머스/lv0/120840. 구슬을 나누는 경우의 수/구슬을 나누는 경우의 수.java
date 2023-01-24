import java.math.BigInteger;
class Solution {
     public BigInteger solution(int balls, int share) {
          return pac(balls).divide(pac(balls - share).multiply(pac(share)));
     }
     
     public Long pacmini(int n, int m){
          Long ans = 1l;
          while(n>m){
               ans *= n;
               n--;
          }
          return ans;
     }
     
     public BigInteger pac(int n){
          BigInteger big=new BigInteger("1");                         //1부터 시작
          for(int i=1; i<=n; i++) {
               big=big.multiply(new BigInteger(Integer.toString(i)));  //1부터 n까지 차례대로 곱해줌
          }
          return big;
     }
}