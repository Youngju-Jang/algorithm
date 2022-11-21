package running40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num18 {
     public int[] solution(int[] answers) {
          int[] num1 = {1, 2, 3, 4, 5}; // 5
          int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8
          int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
          int cnt1 = 0;
          int cnt2 = 0;
          int cnt3 = 0;
          for(int i=0; i<answers.length; i++){
               cnt1 = (answers[i] == num1[i%5]) ? ++cnt1 : cnt1;
               cnt2 = (answers[i] == num2[i%8]) ? ++cnt2 : cnt2;
               cnt3 = (answers[i] == num3[i%10]) ? ++cnt3 : cnt3;
          }
          // max 값 구하고, 같은지 확인후 answer에 max와 같은 index 넣기
          int[] temp = new int[]{cnt1, cnt2, cnt3};
          int max = Arrays.stream(temp).max().getAsInt();
          List<Integer> ans = new ArrayList();
          for(int i=0; i<3; i++){
               if(max == temp[i]){
                    ans.add(i+1);
               }
          }
          return ans.stream().mapToInt(Integer::intValue).toArray();
     }
     
     public static void main(String[] args) {
          num18 test = new num18();
          System.out.println(Arrays.toString(test.solution(new int[]{1,2,3,4,5})));
     }
}
