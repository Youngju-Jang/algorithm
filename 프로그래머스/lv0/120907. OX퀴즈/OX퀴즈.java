class Solution {
    public String[] solution(String[] quiz) {
          String[] answer = new String[quiz.length];
          for (int i = 0; i < quiz.length; i++) {
               String[] temp = quiz[i].split(" ");
               int ans = 0;
               if (temp[1].equals("-")) {
                    ans = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
               } else {
                    ans = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
               }
               
               if (ans == Integer.parseInt(temp[4])) {
                    answer[i] = "O";
               } else {
                    answer[i] = "X";
               }
          }
          return answer;
     }
}