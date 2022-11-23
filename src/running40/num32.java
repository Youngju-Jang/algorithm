package running40;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class num32 {
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
          
          System.out.println(Arrays.toString(nuArr));
          System.out.println(Arrays.toString(stayArr));
          int[] answer = new int[N];
          int index = 0;
          for(Map.Entry<Integer, Double> entry: entries){
               System.out.println("key: " + entry.getKey() + " ,"
               + "value: " + entry.getValue());
               answer[index] = entry.getKey();
               index++;
          }
          return answer;
     }
     
     
     public static void main(String[] args) {
          num32 test = new num32();
          System.out.println(Arrays.toString(test.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
          
     }
}
//다른분 코드 (hashmap안쓰고 객체를 따로 만드심)
// public int[] solution(int N, int[] lastStages) {
//        int nPlayers = lastStages.length;
//        int[] nStagePlayers = new int[N + 2];
//        for (int stage : lastStages) {
//            nStagePlayers[stage] += 1;
//        }
//
//        int remainingPlayers = nPlayers;
//        List<Stage> stages = new ArrayList<>();
//        for (int id = 1 ; id <= N; id++) {
//            double failure = (double) nStagePlayers[id] / remainingPlayers;
//            remainingPlayers -= nStagePlayers[id];
//
//            Stage s = new Stage(id, failure);
//            stages.add(s);
//        }
//        Collections.sort(stages, Collections.reverseOrder());
//
//        int[] answer = new int[N];
//        for (int i = 0; i < N; i++) {
//            answer[i] = stages.get(i).id;
//        }
//        return answer;
//    }
//
//    class Stage implements Comparable<Stage> {
//        public int id;
//        public double failure;
//
//        public Stage(int id_, double failure_) {
//            id = id_;
//            failure = failure_;
//        }
//
//        @Override
//        public int compareTo(Stage o) {
//            if (failure < o.failure ) {
//                return -1;
//            }
//            if (failure > o.failure ) {
//                return 1;
//            }
//            return 0;
//        }
//    }