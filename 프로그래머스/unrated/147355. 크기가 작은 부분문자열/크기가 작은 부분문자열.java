class Solution {
    public int solution(String t, String p) {
          Long pint = Long.parseLong(p);
          int size = Math.min(t.length(), p.length());
          int answer = 0;
          
          for(int i=0; i+size<=t.length(); i++){
               if(Long.parseLong(t.substring(i, i+size)) <= pint){
                    answer++;
               };
          }
          return answer;
     }
}