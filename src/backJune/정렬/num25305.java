package backJune.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num25305 {
     
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          final String[] input1 = br.readLine().split(" ");
          final String[] input2 = br.readLine().split(" "); // 점수 String
          br.close();
          
          int total = Integer.parseInt(input1[0]); // 총 5 명
          int cutline = Integer.parseInt(input1[1]); // 2등까지
          int[] cnt = new int[10001];
          int[] arr = new int[total]; // 점수리스트
          
          for(int i=0; i<total; i++){
               arr[i] = Integer.parseInt(input2[i]);
          }
          for(int i=0; i<total; i++){
               cnt[arr[i]]++;
          }
          
          for(int i=10000; i>=0; i--){
               while(cnt[i] > 0){
                    cnt[i]--;
                    cutline--;
                    if(cutline==0){
                         System.out.println(i);
                         return;
                    }
               }
          }
          
          
          
          
     }
}
