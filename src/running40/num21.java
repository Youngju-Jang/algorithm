package running40;

public class num21 {
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
                         };}}}
          return cnt;
     }
     boolean is_prime(int num){
          int cnt = 0;
          for(int i=1; i<num; i++){
               if(num % i ==0) cnt++;
               if(cnt >=2) return false;
          }
          return true;
     }
}
