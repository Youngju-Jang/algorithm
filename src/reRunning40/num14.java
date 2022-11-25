package reRunning40;
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class num14 {
     public static int solution(int[][] sizes) {
          int wMax = 0;
          int hMax = 0;
          for(int[] arr : sizes){
               wMax = Math.max( Math.max(arr[0], arr[1]), wMax);
               hMax = Math.max( Math.min(arr[0], arr[1]), hMax);
          }
          return wMax * hMax;
     }
     
     public static void main(String[] args) {
          System.out.println(num14.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
     }
}
