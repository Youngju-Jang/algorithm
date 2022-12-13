package backJune.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num1110 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int ori = Integer.parseInt(br.readLine());
          int old = ori;
          int cnt = 0;
          
          do {
               old = (old % 10) * 10 + ((old / 10) + (old % 10)) % 10;
               cnt++;
               
          } while (old != ori);
          
          System.out.println(cnt);
          br.close();
          
          
     }
}
