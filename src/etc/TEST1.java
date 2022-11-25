package etc;

public class TEST1 {
     // 모의고사 -
     // 항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.
     public String solution(int _month, int _day) {
          int month = _month; // 6
          int day = _day + 98; // 22+98
          
          int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
          
          while(day > mon[_month-1]){
               day -= mon[month++ -1];
               if(month > 12){
                    month = 1;
               }
          }
          return month + "월 " + day + "일";
     }
     
     public static void main(String[] args) {
          TEST1 method = new TEST1();
          System.out.println(method.solution(1, 18));
     }
}
