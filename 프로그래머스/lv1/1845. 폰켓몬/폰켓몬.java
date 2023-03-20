import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
          int[] arr = Arrays.stream(nums).distinct().toArray(); // 중복제거
          int chooseNum = nums.length /2;
          if(chooseNum >= arr.length){
               return arr.length;
          }else {
               return chooseNum;
          }
     }
}