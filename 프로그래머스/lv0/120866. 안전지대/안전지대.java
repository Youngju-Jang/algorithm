class Solution {
public int solution(int[][] board) {
          int answer = 0;
          int[][] cnt = new int[board.length+2][board.length+2];
          for(int i=0; i< board.length; i++){
               for(int j=0; j< board.length; j++){
                    if(board[i][j]==1){
                         for(int r=i; r<=i+2; r++){
                              for(int c=j; c<=j+2; c++){
                                   cnt[r][c]++;
                              }
                         }
                    }
               }
          }
          for(int r=1; r<=board.length; r++){
               for(int c=1; c<= board.length; c++){
                    if(cnt[r][c]==0) answer++;
               }
          }
          return answer;
     }
}