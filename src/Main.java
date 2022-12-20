import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
     
     public int solution(int[] array, int n) {
          int gap = 101;
          int answer = 300;
          for(int i : array){
               if(Math.abs(n-i) < gap){
                    gap = Math.abs(n-i);
                    answer = i;
               }else if(Math.abs(n-i) == gap){
                    answer = Math.min(answer, i);
               }
          }
          return answer;
     }
     
     public static void main(String[] args) {
//          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3}, "right")));
//          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 2)));
//          System.out.println((new Main().solution("dfjardstddetckdaccccdegk", 4)));
//          System.out.println((new Main().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})));
//          System.out.println(Arrays.toString(new Main().solution(24)));
//          System.out.println((new Main().solution(".... . .-.. .-.. ---")));
          System.out.println((new Main().solution(new int[]{9,10,11}, 10)));
//          System.out.println(new Main().solution("allpe","apple"));
//          System.out.println(Arrays.toString(new Main().solution(1,2, 1, 2)));
     }
}
