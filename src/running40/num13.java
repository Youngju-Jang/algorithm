package running40;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class num13 {
     public int solution(int n) {
          String[] arr = Integer.toString(n, 3).split("");
          String [] temp = new String[arr.length];
          for(int i=0; i<arr.length; i++){
               temp[arr.length-1-i] = arr[i]; // [0,0,2,1]
          }
          return Integer.parseInt((String.join("", temp)),3);
     }
     static String str = "";
     public static void main(String[] args) {
          str = "";
          num13 test = new num13();//"1200" >49 50 48 48 >>(-48)>>1 2 0 0 >> [1, 2, 0, 0]
          Integer.toString(45, 3).chars().map(i->i-'0').toArray();
          ArrayList list = Integer.toString(45, 3).chars().map(i->i-'0').boxed().collect(Collectors.toCollection(ArrayList::new));
          Collections.reverse(list); // 1200
          System.out.println(String.join("", list));
          String result = Stream.of(list).map(n -> String.valueOf(n)).collect(Collectors.joining(""));
          System.out.println(result);
          
          
     }
}
