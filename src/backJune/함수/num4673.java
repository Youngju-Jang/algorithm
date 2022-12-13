package backJune.함수;

import java.io.IOException;
import java.util.HashSet;


public class num4673 {
     public static void main(String[] args) throws IOException {
          
          HashSet<Integer> hash = new HashSet<Integer>();
          
          for(int i=1; i<=10000; i++) {
               hash.add(i);
          }
          
          for(int i=1; i<=10000; i++) {
               int b = self(i);
               if(b > 10000) {
                    continue;
               }else {
                    hash.remove(b);
               }
          }
          
          for(int i : hash) {
               System.out.println(i);
          }
          
     }
     
     public static int self(int n) {
          
          int sum = n;
          while(n != 0) {
               sum += n%10;
               n /= 10;
          }
          return sum;
     }
}

