package backJune.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num8958 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();
          int n = Integer.parseInt(br.readLine());
          
          
          for(int i=0; i<n; i++) {
               int s = 0;
               int sum = 0;
               String[] arr = br.readLine().split("");
               
               for(String a : arr) {
                    if(a.equals("O")) {
                         s++;
                    }else {
                         s = 0;
                    }
                    sum += s;
               }
               sb.append(sum).append('\n');
          }
          System.out.println(sb);
     }
}
