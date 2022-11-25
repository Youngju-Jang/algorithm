package reRunning40;
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class num21 {
     public int solution(int[] nums) {
          int ans = 0;
          for(int i=0; i<nums.length-2; i++){
               for(int j=i+1; j<nums.length-1; j++){
                    for(int z=j+1; z<nums.length; z++){
                         if(is_prime(nums[i] + nums[j] + nums[z])) ans++;
                    }
               }
          }
          return 0;
     }
     public boolean is_prime(int num){
          if(num==2) return true;
          if(num==1 || num%2==0) return false; // 짝수거르기
          for(int i=3; i<num/i+1; i+=2){ // 소수거르기
               if(num%i ==0) return false;
          }
          return true;
     }
}
