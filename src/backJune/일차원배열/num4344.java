package backJune.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class num4344 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();
          int n = Integer.parseInt(br.readLine());
          
          
          for(int i=0; i<n; i++) {
               StringTokenizer st = new StringTokenizer(br.readLine()," ");
               int stNum = Integer.parseInt(st.nextToken());
               ArrayList<Integer> score = new ArrayList<Integer>();
               int sum = 0;
               
               for(int j=0; j<stNum; j++) {
                    int a = Integer.parseInt(st.nextToken());
                    sum += a;
                    score.add(a);
               }
               
               float avg = sum/stNum;
               int cnt = 0;
               
               for(int s : score) {
                    if(s> avg) {
                         cnt++;
                    }
               }
               double perc =  Math.round((float)cnt/(float)stNum*100*1000)/1000.0;
               sb.append(String.format("%.3f", perc)).append('%').append('\n');
          }
          System.out.println(sb);
     }
}

