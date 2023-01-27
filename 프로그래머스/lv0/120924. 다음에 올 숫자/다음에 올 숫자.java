class Solution {
    public int solution(int[] common) {
          //등차수열 : a + (n-1)d
          //등비수열 : a* r^(n-1)
          if(common.length==2){
               return common[1]+(common[1]-common[0]);
          }
          //등차수열
          if(common[1]-common[0] == common[2]-common[1]){
               return common[0] + (common.length)*(common[1]-common[0]);
          }else{
               // 등비수열
               return common[0] * (int)Math.pow((common[1]/common[0]),(common.length));
          }
     }
}