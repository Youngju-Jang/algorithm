import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
     
     public int solution(String before, String after) {
          String[] bef = before.split("");
          String[] aft = after.split("");
          String b = Arrays.stream(bef).sorted().collect(Collectors.joining(""));
          String a = Arrays.stream(aft).sorted().collect(Collectors.joining(""));
          if(b.equals(a)) return 1;
          return 0;
     }
     
     public static void main(String[] args) {

//          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3}, "right")));
//          System.out.println((new Main().solution(new int[]{0, -31, 24, 10, 1, 9})));
//          System.out.println((new Main().solution("dfjardstddetckdaccccdegk", 4)));
//          System.out.println((new Main().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})));
//          System.out.println(Arrays.toString(new Main().solution(24)));
//          System.out.println((new Main().solution(".... . .-.. .-.. ---")));
//          System.out.println((new Main().solution(3628800)));
          System.out.println(new Main().solution("allpe","apple"));
     }
}
