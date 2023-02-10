class Solution {
    public int solution(int[] nums) {
          // 일단 소수판정 함수 만들기.. ㅇㅋ
          // 3개더해서 같은수인 소수 여러번나오면 한번으로치는가? 아닐듯
          // for문 3개돌려서 합하고 카운트까지 올리기
          int cnt = 0;
          for(int a=0; a<nums.length-2; a++){
               for(int b=a+1; b<nums.length-1; b++){
                    for(int c=b+1; c<nums.length; c++){
                         if(is_prime(nums[a] + nums[b] + nums[c])){
                              cnt++;
                         };
                    }
               }
          }          
          return cnt;
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