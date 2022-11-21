package running40;

import java.util.Comparator;
import java.util.stream.Collectors;

public class num20 {
     // https://school.programmers.co.kr/learn/courses/30/lessons/12917
     public String solution(String s) {
          // byte값으로 변환 > 내림차순 정렬 > 다시 문자로
          int len = s.split("").length;
          byte[] bytes = new byte[len];
          Byte[] temp = s.chars().boxed().sorted(Comparator.reverseOrder()).map(Integer::byteValue)
                         .collect(Collectors.toList())
                         .toArray(new Byte[len]);
          
          for(int i=0; i<temp.length; i++){
               bytes[i] = temp[i];
          }
          
          return new String(bytes);
     }
     
     public static void main(String[] args) {
          num20 test = new num20();
          String ans = test.solution("Zbcdefg");
          System.out.println(ans);
     }
     // 개편전 다른사람답
//     public String reverseStr(String str){
//          char[] sol = str.toCharArray();
//          Arrays.sort(sol);
//          return new StringBuilder(new String(sol)).reverse().toString();
//     }
     
     // stream 다른사람꺼 ㄱㄱㄱㄱ 굳이 byte로 바꿀필요 없었다. 안바꿔도 알아서 정렬해줌
     //public String reverseStr(String str){
     //       return Stream.of(str.split(""))
                    //  .sorted(Comparator.reverseOrder())
                    //  .collect(Collectors.joining());
     //  }
}
