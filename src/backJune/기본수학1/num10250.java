package backJune.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class num10250 {
     public static void main(String[] args) throws IOException {
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuffer sb = new StringBuffer();
          int n = Integer.parseInt(br.readLine());
          for(int i=0; i<n; i++) {
               
               StringTokenizer st = new StringTokenizer(br.readLine()," ");
               int H = Integer.parseInt(st.nextToken());
               int W = Integer.parseInt(st.nextToken());
               int N = Integer.parseInt(st.nextToken());
               int yy = N % H;
               int xx = N / H;
               if(yy == 0) {
                    yy += H;
               }else {
                    xx++;
               }
               sb.append((yy*100)+xx+"\n");
          }
          System.out.println(sb.toString());
     }
}

