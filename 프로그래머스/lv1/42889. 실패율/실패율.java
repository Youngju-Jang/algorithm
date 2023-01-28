import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int N, int[] stages) {
          // 스테이지별 누적도달수 배열 : N+1
          int[] nuArr = IntStream.generate(()->0).limit(N+1).toArray();
          // 스테이지별 머물러있는 수 배열 : N+1
          int[] stayArr = IntStream.generate(()->0).limit(N+1).toArray();
          
          Map<Integer, Double> ansMap = new HashMap<>();
          for(int i : stages){
               for(int j=1; j<=i; j++){
                    nuArr[j-1]++;
               }
               stayArr[i-1]++;
          }
          
          for(int i=0; i<N; i++){
               if(nuArr[i] == 0) ansMap.put(i+1, (double)0);
               else ansMap.put(i+1, (double)stayArr[i]/nuArr[i]);
          }
          List<Map.Entry<Integer, Double>> entries = ansMap.entrySet().stream()
                                                       .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                                                            .collect(Collectors.toList());
          
          int[] answer = new int[N];
          int index = 0;
          for(Map.Entry<Integer, Double> entry: entries){
               answer[index] = entry.getKey();
               index++;
          }
          return answer;
     }
}