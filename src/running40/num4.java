package running40;

import java.util.Arrays;

public class num4 {
     //https://school.programmers.co.kr/learn/courses/30/lessons/12922?language=java
     public String solution(String[] participant, String[] completion) {
          Arrays.sort(participant);
          Arrays.sort(completion);
          int index = 0;
          for(String com : completion){
               if(!com.equals(participant[index])){
                    return participant[index];
               }
               index++;
          }
          return participant[participant.length-1];
     }
     
     public static void main(String[] args) {
          num4 test = new num4();
          String ans = test.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}
                         , new String[]{"josipa", "filipa", "marina", "nikola"});
     
          System.out.println(ans);
     }
     
     //다른사람풀이
//     String answer = "";
//     HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//          if (hm.get(key) != 0){
//               answer = key;
//          }
//     }
//        return answer;
}
