package reRunning40;

import java.lang.reflect.Array;
import java.util.*;

public class num19 {
     public String[] solution(String[] strings, int n) {
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
