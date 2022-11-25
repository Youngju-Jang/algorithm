package reRunning40;
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class num12 {
     public boolean solution(int x) {
          
          int sum = String.valueOf(x).chars().map(ch-> ch-'0').sum();
          return (x % sum ==0)? true : false;
     }
}
