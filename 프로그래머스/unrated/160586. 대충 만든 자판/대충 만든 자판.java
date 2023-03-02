class Solution {
    public int[] solution(String[] keymap, String[] targets) {
          int[] alpa = new int[26]; // 0~25
          // alpa 배열 채우기
          for(String st : keymap){
               int cnt = 0;
               for(char ch : st.toCharArray()){
                    int chNum = (int)ch - 65;
                    if(alpa[chNum] == 0){
                         alpa[chNum] = cnt+1;
                    }else if(alpa[chNum]>cnt+1){
                         alpa[chNum] = cnt+1;
                    }
                    cnt++;
               }
          }
          int[] answer = new int[targets.length];
          // 값 구하기
          for(int i=0; i< targets.length; i++){
               for(char ch : targets[i].toCharArray()){
                    int chNum = (int)ch - 65;
                    if(alpa[chNum]==0){
                         answer[i] = -1;
                         break;
                    }else{
                         answer[i] += alpa[chNum];
                    }
               }
          }
          return answer;
     }
}