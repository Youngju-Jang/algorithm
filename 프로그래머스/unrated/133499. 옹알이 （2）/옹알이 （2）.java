class Solution {
   public int solution(String[] babbling) {
          String[] bab = new String[]{"aya", "ye", "woo", "ma"};
          int answer = 0;
          for(String st : babbling){
               for(String ba : bab){
                    if(st.contains(ba+ba)){
                         continue;
                    }
                    st = st.replaceAll(ba, " ");
               }
               if(st.replaceAll(" ","").equals("")) answer++;
          }
          return answer;
     }
}