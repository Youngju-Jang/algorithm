import java.util.Arrays;
class Solution {
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
          String answer = arr[0] + " " + arr[arr.length-1];
          return answer;
    }
}