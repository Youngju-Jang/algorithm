import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
     
     public int[][] solution(int[] num_list, int n) {
          int x = (int)Math.ceil(num_list.length/(double)n);
          int[][] answer = new int[x][n];
          int i=0;
               for(int j=0; j<x; j++){
                    for(int z=0; z<n; z++){
                         answer[j][z] = num_list[i++];
                         if(i >= num_list.length) return answer;
                    }
               }
          
          return answer;
     }
     
     public static void main(String[] args) {
//          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3}, "right")));
          System.out.println(Arrays.toString(new Main().solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 2)));
//          System.out.println((new Main().solution("dfjardstddetckdaccccdegk", 4)));
//          System.out.println((new Main().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})));
//          System.out.println(Arrays.toString(new Main().solution(24)));
//          System.out.println((new Main().solution(".... . .-.. .-.. ---")));
//          System.out.println((new Main().solution("3628800")));
//          System.out.println(new Main().solution("allpe","apple"));
     }
}
