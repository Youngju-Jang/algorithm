package backJune.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class num2480 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          StringTokenizer st = new StringTokenizer(br.readLine(), " ");
          int a = Integer.parseInt(st.nextToken());
          int b = Integer.parseInt(st.nextToken());
          int c = Integer.parseInt(st.nextToken());
          
          if (a == b & b == c) {
               System.out.println(10000 + 1000 * a);
          } else if (a == b || a == c) {
               System.out.println(1000 + a * 100);
          } else if (b == c) {
               System.out.println(1000 + b * 100);
          } else {
               int e = Math.max(a, Math.max(b, c));
               System.out.println(e * 100);
          }
          br.close();
          
          
     }
}
