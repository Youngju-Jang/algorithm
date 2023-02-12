class Solution {
    public int solution(int[][] lines) {
          int answer = 0;
          int[] cnt = new int[201];
          for(int[] line: lines){
               for(int i=line[0]; i<line[1]; i++){
                    cnt[i+100]++;
               }
          }
          for(int i : cnt){
               if(i>1) answer++;
          }
          return answer;
     }
}