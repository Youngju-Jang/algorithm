class Solution {
    public int[] solution(int k, int[] score) {
          int[] mj = new int[2001];
          int[] answer = new int[score.length];
          for (int i = 0; i < score.length; i++) {
               mj[score[i]]++;
               if (i < k) {
                    for (int j = 0; j < mj.length; j++) {
                         if (mj[j] != 0) {
                              answer[i] = j;
                              break;
                         }
                    }
               } else {
                    int sum = 0;
                    for (int j = mj.length - 1; j >= 0; j--) {
                         if(mj[j] == 0) continue;
                         sum += mj[j];
                         if(sum >= k){
                              answer[i] = j;
                              break;
                         }
                    }
               }
               
          }
          return answer;
     }
}