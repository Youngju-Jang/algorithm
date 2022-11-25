package reRunning40;
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class num22 {
     public static int solution(String s) {
          String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
          for(int i=0; i<arr.length; i++){
               s = s.replace(arr[i], String.valueOf(i));
          }
          return Integer.parseInt(s);
     }
     
     public static void main(String[] args) {
          System.out.println(solution("one4seveneight"));
     }
}
