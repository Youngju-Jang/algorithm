class Solution {
    public int solution(String dartResult) {
          int[] sumArr = new int[3];
          int index = 0;
          for (String ch : dartResult.split("")) {
               if (ch.matches("[0-9]")) {
                    if (ch.equals("0") && (index != 0)) {
                         if (sumArr[index - 1] == 1) {
                              index--;
                              sumArr[index] = 10;
                         }
                    } else {
                         sumArr[index] = Integer.parseInt(ch);
                    }
                    index++;
               } else if (ch.equals("D")) {
                    sumArr[index - 1] *= sumArr[index - 1];
               } else if (ch.equals("T")) {
                    sumArr[index - 1] *= sumArr[index - 1] * sumArr[index - 1];
               } else if (ch.equals("*")) {
                    if (index != 1) sumArr[index - 2] *= 2;
                    sumArr[index - 1] *= 2;
               } else if (ch.equals("#")) {
                    sumArr[index - 1] *= (-1);
               }
          }
          int answer = sumArr[0] + sumArr[1] + sumArr[2];
          return answer;
     }

}