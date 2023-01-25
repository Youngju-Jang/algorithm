import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
          //[[0,0,0,0,0]         [1,5,3,5,1,2,1,4]
          // [0,0,1,0,3]
          // [0,2,5,0,1]
          // [4,2,4,4,2]
          // [3,5,1,3,1]]
          int answer = 0;
          Stack<Integer> stack = new Stack<Integer>();
          for (int m : moves) {
               for (int i = 0; i <  board.length; i++) { // board 위에서부터 훑기
                    if(board[ board.length-1][m-1] == 0) break;
                    if (board[i][m-1] == 0) continue;
                    else {
                         // stack 맨위에꺼 확인 후 같은거면 없애고, 아니면 쌓기
                         if(!stack.empty()){  // 들어있는데
                              if (stack.peek() == board[i][m-1]) { // 같은거있으면
                                   stack.pop();
                                   answer+=2;
                              }else{ // 안같으면
                                   stack.push(board[i][m-1]);
                              }
                         }
                         else stack.push(board[i][m-1]); // 안같음
                         board[i][m-1] = 0;
                         break;
                    }
               }
          }
          return answer;
     }
}