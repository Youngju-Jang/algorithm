package running40;
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class num12 {
     public boolean solution(int x) {
          int charSum = Integer.toString(x).chars().map(ch-> ch-'0').sum();
          return (x%charSum ==0) ? true : false;
     }
     static int sum = 0;
     public static void main(String[] args) {
          num12 test = new num12();
     
          System.out.println(test.solution(13));
          
     }
}
