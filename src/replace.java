import java.util.Arrays;
import java.util.stream.Collectors;

public class replace {
     public static void main(String[] args) {
          String base = "[1, 2, 3, 4, 5, 6, 7, 8]";
          String base1 = base.replaceAll("\\[", "").replaceAll("\\]","");
          String ans = "{";
          for(String st : base1.split(",")){
               ans += st+",";
          }
          
          System.out.println(ans.substring(0, ans.length()-4) + "}");
     }
}
