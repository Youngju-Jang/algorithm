package reRunning40;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class num4 {
     public String solution(String[] participant, String[] completion) {
          String[] part = Arrays.stream(participant).sorted().toArray(String[]::new);
          String[] part2 = Arrays.stream(completion).sorted().toArray(String[]::new);
          for(int i=0; i<part2.length; i++){
               if(part[i].equals(part2[i])){
                    continue;
               }else {
                    return part[i];
               }
          }
          return part[participant.length-1];
     }
     
     public static void main(String[] args) {
          num4 test = new num4();
          System.out.println(test.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
     }
     
     
}
