package reRunning40;

// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class num5 {
     public String solution(String s) {
          String answer = "";
          for(String st: (s+".").split(" ")){
               int index= 0;
               for(String ch : st.split("")){
                    answer += (index%2==0) ? ch.toUpperCase() : ch.toLowerCase();
                    index++;
               }
               answer+= " ";
          }
          return answer.substring(0,answer.length()-2);
     }
     
     public static void main(String[] args) {
          num5 test= new num5();
          System.out.println(test.solution("  try  hello world  "));
     }
     
}
