package backJune.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num2562 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          
          int n ;
          int max = 0;
          int idx = 0;
          
          for(int i=1; i<10; i++) {
               n = Integer.parseInt(br.readLine());
               if(max < n) {
                    max = n;
                    idx = i;
               }
          }
          
          System.out.println(max);
          System.out.println(idx);
          
          
          
     }
}
