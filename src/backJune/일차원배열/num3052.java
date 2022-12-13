package backJune.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class num3052 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          HashSet<Integer> set = new HashSet<Integer>();
          
          for(int i=0; i<10; i++) {
               int n = Integer.parseInt(br.readLine());
               set.add(n%42);
          }
          
          System.out.println(set.size());
          
     }
}
