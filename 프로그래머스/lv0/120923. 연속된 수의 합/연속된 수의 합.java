class Solution {
    public int[] solution(int num, int total) {
          int add = 0;
          for(int i=1; i<num; i++){
               add += i;
          }
          int start = (total - add)/num;
          int[] answer = new int[num];
          for(int i=0; i<num; i++){
               answer[i] = start + i;
          }
          return answer;
     }
}