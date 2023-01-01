import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
      // Arrays.sort(participant);
      // Arrays.sort(completion);
      // int index = 0;
      // for(String com : completion){               
      //      if(!com.equals(participant[index])){
      //           return participant[index];
      //      }
      //      index++;
      // }
      // return participant[participant.length-1];
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
}