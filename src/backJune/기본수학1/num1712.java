package backJune.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1712 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String[] arr = (br.readLine().split(" "));
          int a = Integer.parseInt(arr[0]);
          int b = Integer.parseInt(arr[1]);
          int c = Integer.parseInt(arr[2]);
          
          if (b >= c) {
               System.out.println(-1);
          } else {
               int n = (int) Math.floor((double) a / (c - b)) + 1;
               System.out.println(n);
          }
          
     }
}

