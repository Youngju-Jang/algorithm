package backJune.조건문;
import java.io.BufferedReader;
     import java.io.IOException;
     import java.io.InputStreamReader;
     import java.util.StringTokenizer;


public class num9498 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          String str = br.readLine();
          StringTokenizer st = new StringTokenizer(str," ");
          int a = Integer.parseInt(st.nextToken());
          
          if(a >= 90) {
               System.out.println("A");
          }else if(a >= 80) {
               System.out.println("B");
          }else if(a >= 70) {
               System.out.println("C");
          }else if(a >= 60) {
               System.out.println("D");
          }else {System.out.println("F");}
          
          br.close();
          
     }
}
