import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
          // 겹치는 수 확인 >> 7-cnt = 최저순위
          // lottos - 안겹치는수 = 최고갯수 =
          // lottos >> arraylist >> .contains == 겹치는거
          // 0인거 count
//           ArrayList winArr = Arrays.stream(win_nums).boxed().collect(Collectors.toCollection(ArrayList::new));
//           long same = Arrays.stream(lottos).filter(winArr::contains).count();
//           long zero =  Arrays.stream(lottos).filter(n -> n==0).count();
        
//           int good = (int)(7-same-zero);
//           int bad = (int)(7-same);
//             good = (good > 6) ? 6 : good;
//           bad = (bad >6) ? 6 : bad;
//           return new int[]{good, bad};
        int same = 0; // 0개~6개
          int zero = 0; // 0개~6개
          ArrayList<Integer> myArr = Arrays.stream(lottos).boxed().collect(Collectors.toCollection(ArrayList::new));
          for(int i : myArr){
               if(i==0) zero++;
               for(int win : win_nums){
                    if(i==win) same++;
               }
          }
          int[] ans = new int[]{(7-same-zero ==7)? 6 : 7-same-zero, (7-same ==7)? 6 : 7-same};
          return ans;
     }
}