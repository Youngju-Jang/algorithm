package backJune.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1193 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int i = Integer.parseInt(br.readLine());
          
          int sum = 1 ;
          int t = 1;
          while(true) {
               if(sum == i) {
                    if(t%2 == 0) {
                         System.out.println(t+"/"+1);
                         break;
                    }else {
                         System.out.println(1+"/"+t);
                         break;
                    }
               }
               else if(sum > i) {
                    if(t%2 == 0) {
                         System.out.println(t-(sum-i)+"/"+(1+(sum-i)));
                         break;
                    }else {
                         System.out.println(1+(sum-i)+"/"+(t-(sum-i)));
                         break;
                    }
               }
               else {
                    t++;
                    sum += t;
               }
          }
     }
}

