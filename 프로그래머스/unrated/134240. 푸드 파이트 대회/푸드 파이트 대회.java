class Solution {
    public String solution(int[] food) {
          StringBuffer sb = new StringBuffer();
          for(int i=1; i<food.length; i++){
               if(food[i]<2) continue;
               sb.append(Integer.toString(i).repeat(food[i]/2));
          }
          String front = sb.toString();
          sb.append("0");
          char[] chArr = front.toCharArray();
          for(int i=chArr.length-1; i>=0; i--){
               sb.append(chArr[i]);
          }
          return sb.toString();
     }
}