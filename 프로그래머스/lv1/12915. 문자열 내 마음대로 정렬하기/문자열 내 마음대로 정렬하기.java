import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
//           String[] answer = new String[strings.length];
//           ArrayList<String> solutionString = new ArrayList<>();
          
//           for (String string: strings){
//                solutionString.add(string.charAt(n) + string);
//           }
//           Collections.sort(solutionString);
          
//           for(int i=0; i< solutionString.size(); i++){
//                answer[i] = solutionString.get(i).substring(1);
//           }
//           return answer;
         List<String> newArr = new ArrayList<>();
          for(String s : strings){
               newArr.add(s.charAt(n) + s);
          }
          Collections.sort(newArr); // 정렬
          String[] ans = new String[newArr.size()];
          for(int i=0; i<newArr.size(); i++){
               ans[i] = newArr.get(i).substring(1);
          }
          return ans;
    }
}