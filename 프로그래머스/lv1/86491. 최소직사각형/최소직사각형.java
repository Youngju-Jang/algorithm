import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
          
          // int tempx = 0;
          // int tempy = 0;
          // for(int i=0; i<sizes.length; i++){
          //      if(sizes[i][0] >= sizes[i][1]) {
          //           tempx = (tempx <= sizes[i][0]) ?  sizes[i][0] : tempx;
          //           tempy = (tempy <= sizes[i][1]) ?  sizes[i][1] : tempy;
          //      }else {
          //           tempx = (tempx <= sizes[i][1]) ?  sizes[i][1] : tempx;
          //           tempy = (tempy <= sizes[i][0]) ?  sizes[i][0] : tempy;
          //      }
          // }
          // return tempx * tempy;
          int wMax = 0;
          int hMax = 0;
          for(int[] arr : sizes){
               wMax = Math.max( Math.max(arr[0], arr[1]), wMax);
               hMax = Math.max( Math.min(arr[0], arr[1]), hMax);
          }
          return wMax * hMax;
     }
}