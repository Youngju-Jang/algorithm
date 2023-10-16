class Solution {
    public int solution(int[][] dots) {
        int width = 0;
          int height = 0;
          int x0 = dots[0][0];
          int y0 = dots[0][1];
          for(int[] arr : dots){
               if(arr[0] != x0){
                    width = Math.abs(x0 - arr[0]);
               }
               if(arr[1] != y0){
                    height = Math.abs(y0 - arr[1]);
               }
          }
          return width * height;
    }
}