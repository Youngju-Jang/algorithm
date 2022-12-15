import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
     
     public int[] solution(int denum1, int num1, int denum2, int num2) {
          int dn3 = denum1 * num2 + denum2 * num1;
          int n3 = num1 * num2;
          for(int i=2; i<=Math.min(dn3, n3); i++){
               if(dn3%i==0 && n3%i==0){
                    dn3 /= i;
                    n3 /= i;
                    i--;
               }
          }
          int[] answer = {dn3, n3};
          return answer;
     }
     
     public static void main(String[] args) {
//          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3}, "right")));
//          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 2)));
//          System.out.println((new Main().solution("dfjardstddetckdaccccdegk", 4)));
//          System.out.println((new Main().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})));
//          System.out.println(Arrays.toString(new Main().solution(24)));
//          System.out.println((new Main().solution(".... . .-.. .-.. ---")));
//          System.out.println((new Main().solution("3628800")));
//          System.out.println(new Main().solution("allpe","apple"));
          System.out.println(Arrays.toString(new Main().solution(1,2, 1, 2)));
     }
}
