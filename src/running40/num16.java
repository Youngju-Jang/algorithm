package running40;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class num16 {
     public int[] solution(int[] numbers) {
          Set<Integer> solution = new HashSet<>();
          // 다른 인덱스 2개뽑아 더하기 >> set에 add
          // 만들수있는 모든수 배열 오름차순 리턴 >> sort
          for(int i=0; i<numbers.length-1; i++){
               for(int j=i+1; j<numbers.length; j++){
                    solution.add(numbers[i] + numbers[j]);
               }
          }
          int[] answer = solution.stream().mapToInt(Integer::intValue).sorted().toArray();
          return answer;
     }
     
     public static void main(String[] args) {
          num16 test = new num16();
          int[] ans = test.solution(new int[]{2,1,3,0,0,4,1});
          System.out.println(Arrays.toString(ans));
     }
}
