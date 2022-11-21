package running40;

import java.util.Arrays;

public class num14 {
     public int solution(int[][] sizes) {
          
          int tempx = 0;
          int tempy = 0;
          for(int i=0; i<sizes.length; i++){
               if(sizes[i][0] >= sizes[i][1]) {
                    tempx = (tempx <= sizes[i][0]) ?  sizes[i][0] : tempx;
                    tempy = (tempy <= sizes[i][1]) ?  sizes[i][1] : tempy;
               }else {
                    tempx = (tempx <= sizes[i][1]) ?  sizes[i][1] : tempx;
                    tempy = (tempy <= sizes[i][0]) ?  sizes[i][0] : tempy;
               }
          }
          return tempx * tempy;
     }
     //public int solution(int[][] sizes) {
     //        int length = 0, height = 0;
     //        for (int[] card : sizes) {
     //            length = Math.max(length, Math.max(card[0], card[1]));
     //            height = Math.max(height, Math.min(card[0], card[1]));
     //        }
     //        int answer = length * height;
     //        return answer;
     //    }
     
     public static void main(String[] args) {
          num14 test = new num14();
          int ans = test.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
          System.out.println(ans);
     }
}
