class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
          int c1 = 0;
          int c2 = 0;
          for(String ch : goal){
               if(cards1.length>c1 && ch.equals(cards1[c1])){
                    c1++;
                    continue;
               }else if(cards2.length>c2 && ch.equals(cards2[c2])){
                    c2++;
                    continue;
               }else{
                    return "No";
               }
          }
          return "Yes";
     }
}