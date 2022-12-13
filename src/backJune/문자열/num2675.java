package backJune.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num2675 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();
          
          int times = Integer.parseInt(br.readLine());
          for(int i=0; i<times; i++) {
               String[] ori = br.readLine().split(" ");
               int num = Integer.parseInt(ori[0]);
               
               for(byte val : ori[1].getBytes()) {
                    for(int z=0; z<num; z++) {
                         sb.append((char)val);
                    }
               }
               sb.append('\n');
          }
          System.out.print(sb);
     }
}


