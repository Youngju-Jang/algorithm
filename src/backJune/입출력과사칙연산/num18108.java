package backJune.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class num18108 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          String str = br.readLine();
          StringTokenizer st = new StringTokenizer(str," ");
          int a = Integer.parseInt(st.nextToken());
          
          System.out.println(a-543);
          
     }
}

