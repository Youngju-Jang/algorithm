package backJune.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num5622 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String[] a = br.readLine().split("");
          
          int sum = 0;
          for(String snum : a) {
               int num = snum.getBytes()[0] - 65; //0:012 1:345 2:678 3:9,10,11, 4:12,13,14/5:15,16,17,18/6: 19,20,21//7: 22,23 24,25
               if(18 <= num && num <24) {
                    num--;
               }else if(num >= 24) {
                    num -= 2;
               }
               
               sum += num/3 + 3;
          }
          System.out.println(sum);
          
     }
     
}