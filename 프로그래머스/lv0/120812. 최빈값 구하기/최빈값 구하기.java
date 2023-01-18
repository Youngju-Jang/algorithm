import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
          int[] temp = new int[1000];
          for(int i : array){
               temp[i]++;
          }
          int[] ori = temp.clone();
          Arrays.sort(temp);
          if(temp[999]==temp[998]) return -1;
          
          int maxidx = 0;
          for(int i=0; i<1000; i++){
               maxidx = (temp[999]==ori[i])? i : maxidx;
          }
          return maxidx;
     }
}