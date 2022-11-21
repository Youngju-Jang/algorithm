package running40;

public class num22 {
     // https://school.programmers.co.kr/learn/courses/30/lessons/81301
     public int solution(String s) {
          // string 함수 응용해보기
          String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
          for(int i=0; i<10; i++){
               s = s.replace(arr[i], Integer.toString(i));
          }
          return Integer.parseInt(s);
     }
     
     public static void main(String[] args) {
          num22 test = new num22();
          System.out.println(test.solution("one4seveneight"));
          
          
     }
}
