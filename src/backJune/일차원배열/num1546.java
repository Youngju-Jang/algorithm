package backJune.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class num1546 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
          ArrayList<Float> num = new ArrayList<Float>(n);
          StringTokenizer st = new StringTokenizer(br.readLine()," ");
          
          while(st.hasMoreTokens()) {
               num.add(Float.parseFloat(st.nextToken()));
          }
          
          
          float max = Collections.max(num);
          float sum = 0;
          for(float i : num) {
               i = i/max*100;
               sum += i;
          }
          
          System.out.println(sum/n);
          
          
     }
}
