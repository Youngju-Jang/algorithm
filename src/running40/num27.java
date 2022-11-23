package running40;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class num27 {
     public int solution(int[] d, int budget) {
//          List<Integer> arr =  Arrays.stream(d).sorted().boxed().collect(Collectors.toCollection(ArrayList::new));
          Arrays.sort(d);
          int answer = 0;
          int sum = 0;
          for(int i : d){
               sum += i;
               if(sum > budget){
                    return answer;
               }
               answer++;
          }
          return answer;
     }
}
