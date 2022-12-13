package backJune.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2941 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String[] arr = br.readLine().split("");
          
          int cnt = arr.length;
          
          for(int i=1; i< arr.length; i++) {
               if(arr[i].equals("=")) {
                    if(i>=2 && arr[i-2].equals("d") && arr[i-1].equals("z")) {
                         cnt -= 2;
                    } else if(arr[i-1].equals("c") || arr[i-1].equals("z") || arr[i-1].equals("s")) {
                         cnt--;
                    }
               }else if(arr[i].equals("-")) {
                    if(arr[i-1].equals("c") || arr[i-1].equals("d")) {
                         cnt--;
                    }
               }else if(arr[i].equals("j")) {
                    if(arr[i-1].equals("l") || arr[i-1].equals("n")) {
                         cnt--;
                    }
               }
          }
          System.out.println(cnt);
     }
     
}