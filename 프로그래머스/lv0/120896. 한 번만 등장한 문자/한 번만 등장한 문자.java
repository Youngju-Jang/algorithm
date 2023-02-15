import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
          String answer = "";
          String more = "";
          for (String ch : s.split("")) {
               if (answer.contains(ch)) {
                    more += ch;
                    answer = answer.replace(ch, "");
               } else {
                    if (!more.contains(ch)) {
                         answer += ch;
                    }
               }
          }
          return Arrays.stream(answer.split("")).sorted().collect(Collectors.joining());
        
        // return Arrays.stream(s.split(""))
          //                .collect(Collectors.groupingBy(s1 -> s1))
          //                .entrySet()
          //                .stream()
          //                .filter(entry -> entry.getValue().size() <= 1)
          //                .map(Map.Entry::getKey)
          //                .sorted()
          //                .collect(Collectors.joining());
     }
}