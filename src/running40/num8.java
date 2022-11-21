package running40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class num8 {
     String res = "";
     public long solution(long n) {
          String a = Arrays.stream(Long.toString(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
          return Long.parseLong(a);
     }
     
     public static void main(String[] args) {
          long n = 118372;
          num8 test = new num8();
          System.out.println(test.solution(n));
     }
     
     //다른사람 코드
     //public int reverseInt(int n){
     //        res = "";
     //        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
     //   >> split("")대신 chars 로 string으로 변환
     //   >> stream 안에 다른변수쓰려면 지역변수아닌 로컬변수여야 함!!!
     //        return Integer.parseInt(res);
     //    }
}
