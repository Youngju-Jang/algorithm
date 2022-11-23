package reRunning40;

public class num1 {
     public static String solution(int a, int b) {
          String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
          int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};
          int day = 0;
          for(int i=1; i<a; i++){
               day += mon[i-1];
          }
          day += (b-1);
          return week[(day%7)];
     }
     
     public static void main(String[] args) {
          System.out.println(num1.solution(5, 24));
     }
}
//     LocalDate targetDate = LocalDate.of(2016, a, b);
//     String answer = targetDate.getDayOfWeek().toString().substring(0,3);