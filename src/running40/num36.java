package running40;

// https://school.programmers.co.kr/learn/courses/30/lessons/67256
public class num36 {
     public String solution(int[] numbers, String hand) {
          int[][] phone= {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}}; // 0~9
          String answer = "";//             00 01 02
          int[] left = {3,0}; // 손가락 위치 10 11 12
          int[] right = {3,2};//            20 21 22
                              //            30 31 32
          for(int i=0; i<numbers.length; i++){
               if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                    answer += "L";
                    left = phone[numbers[i]];
               }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                    answer += "R";
                    right = phone[numbers[i]];
               }else { // 2,5,8,0
                    int ldis =Math.abs(phone[numbers[i]][0] - left[0]) +
                         Math.abs(phone[numbers[i]][1] - left[1]);
                    int rdis = Math.abs(phone[numbers[i]][0] - right[0]) +
                         Math.abs(phone[numbers[i]][1] - right[1]);
                    if(ldis > rdis || ((ldis==rdis)&& hand.equals("right"))){ // 왼손이 먼경우
                         answer += "R";
                         right = phone[numbers[i]];
                    }else if(ldis < rdis || ((ldis==rdis)&& hand.equals("left"))) { // 오른이 먼경우
                         answer += "L";
                         left = phone[numbers[i]];
                    }
               }
          }
          return answer;
     }
}
