import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] d, int budget) {
          List<Integer> arr =  Arrays.stream(d).sorted().boxed().collect(Collectors.toCollection(ArrayList::new));
          int answer = 0;
          int sum = 0;
          for(int i : arr){
               sum += i;
               if(sum > budget){
                    return answer;
               }
               answer++;               
          }
          return answer;
     }
}