package running40;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
     public static void main(String[] args) {
          List<Character> chars = Arrays.asList('J', 'a', 'v', 'a');
          char[] charArray = { 'J', 'a', 'v', 'a' };
     
          Stream.of(charArray)
               .map(arr -> new String(arr))
               .collect(Collectors.joining());
          
          chars.stream()
               .map(String::valueOf)
               .collect(Collectors.joining());
     
     }
}
