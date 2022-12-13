package backJune.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1000 {
     
     public static void main(String[] args) throws IOException {

// 방법1
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//
//		System.out.println(a+b);
//
//		in.close();
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          String str = br.readLine();
          StringTokenizer st = new StringTokenizer(str," ");
          int a = Integer.parseInt(st.nextToken());
          int b = Integer.parseInt(st.nextToken());
          
          System.out.println(a+b);

// 방법3
//		String[] strArr = br.readLine().split(" ");
//		int A = Integer.parseInt(strArr[0]);
//		int B = Integer.parseInt(strArr[1]);
     
     
     
     }
}
