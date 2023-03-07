class Solution {
    public String solution(int[] food) {
          StringBuffer sb = new StringBuffer();
          for(int i=1; i<food.length; i++){
               if(food[i]<2) continue;
               sb.append(Integer.toString(i).repeat(food[i]/2));
          }
          return sb.toString() + "0" + sb.reverse().toString();
     }
}