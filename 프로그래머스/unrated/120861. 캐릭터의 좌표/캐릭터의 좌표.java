class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
          for(String go: keyinput){
               boolean l = -(board[0]/2) < answer[0];
               boolean r = answer[0] < (board[0]/2);
               boolean d = -(board[1]/2)< answer[1];
               boolean u = answer[1] < (board[1]/2);
               if(l && go.startsWith("l")){
                    answer[0] = answer[0] - 1;
               }
               if(r && go.startsWith("r")){
                    answer[0] = answer[0] + 1;
               }
               if(u && go.startsWith("u")){
                    answer[1] = answer[1] + 1;
               }
               if(d && go.startsWith("d")){
                    answer[1] = answer[1] - 1;
               }
          }
          return answer;
    }
}