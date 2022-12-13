package backJune.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num11720 {
     public static void main(String[] args) throws IOException {
          
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          br.readLine();
          
          int sum = 0;
          
          for(byte i : br.readLine().getBytes()) {
               sum += (i - 48);
          }
          
          System.out.println(sum);
     }
}