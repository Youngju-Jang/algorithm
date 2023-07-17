class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
          int[] answer = new int[photo.length];
        int cnt = 0;
          for(String[] arr : photo){
               for(String fr : arr){
                    loop : for(int i=0; i<name.length; i++){
                         if(name[i].equals(fr)){
                              answer[cnt] += yearning[i];
                              break loop;
                         }
                    }
               }
               cnt++;
          }
          return answer;
     }
}