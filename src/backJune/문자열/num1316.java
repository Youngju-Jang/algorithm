package backJune.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class num1316 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          HashSet<String> hs = new HashSet<String>();
          int cnt = num;
          
          for(int i=0; i<num; i++) {
               String[] arr = br.readLine().split("");
               String c1 = null;
               String c2 = null;
               for(int j=0; j<arr.length; j++) {
                    if(j!=0) {c1 = arr[j-1];}
                    c2 = arr[j];
                    if(!hs.contains(c2)) {
                         hs.add(c2);
                    }else {
                         if(c2.equals(c1)) {
                              continue;
                         }else {
                              cnt--;
                              break;
                         }
                    }
               }
               hs.clear();
          }
          System.out.println(cnt);
          
     }
     
}

