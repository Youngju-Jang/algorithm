package running40;

import java.util.ArrayList;
import java.util.Collections;

public class num19 {
     public String[] solution(String[] strings, int n) {
          String[] answer = new String[strings.length];
          ArrayList<String> solutionString = new ArrayList<>();
          
          for (String string: strings){
               solutionString.add(string.charAt(n) + string);
          }
          Collections.sort(solutionString);
          
          for(int i=0; i< solutionString.size(); i++){
               answer[i] = solutionString.get(i).substring(1);
          }
          return answer;
     }
}
