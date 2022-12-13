package backJune.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num2839 {
     
     public static int[][] APT = new int[15][15]; //층,호
     
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int total = Integer.parseInt(br.readLine());
          int cnt = -1;
          int result;
          
          int max = total/5;
          
          for(int i=0; i<=max; i++) {
               if((total - (i*5))%3 == 0) {
                    cnt = (total - (i*5))/3;
                    cnt += i;
               }
          }
          if(cnt == -1) {
               System.out.println(-1);
          }else {
               System.out.println(cnt);
          }
          
          
     }
     
}

