package etc;
// https://teamsparta.notion.site/99-10-d5a648771ace49799163a44ad878ce0d
public class TEST4 {
     public String solution(int[] arr1) {
          String[] ansList = {"모","도","개","걸","윷"};
          int cnt = 0;
          for(int i : arr1){
               if(i==0) cnt++;
          }
          return ansList[cnt];
     }
     
     public static void main(String[] args) {
          TEST4 method = new TEST4();
          int[] arr1 = {1,0,0,1};
          System.out.println(method.solution(arr1));
     }
     
}
