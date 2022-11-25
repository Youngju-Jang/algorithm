package etc;
// https://teamsparta.notion.site/99-10-d5a648771ace49799163a44ad878ce0d
public class TEST5 {
     public void solution(int star) {
          // 코드 작성
          for(int i=0; i<star ; i++){
               System.out.print(" ".repeat(star-1-i));
               System.out.print("*".repeat(2*i+1));
               System.out.print(" ".repeat(star-1-i));
               if(i<star-1){
                    System.out.println();
               }
          }
     }
     
     public static void main(String[] args) {
          TEST5 method = new TEST5();
          int star = 5;
          method.solution(star);
     }
}
