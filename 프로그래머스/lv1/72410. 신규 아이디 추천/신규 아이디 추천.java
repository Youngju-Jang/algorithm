import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String new_id) {
//           // 1차 처리
//           // 1.대문자 > 소문자
//           // 2.filter 로 제외문자 모두제거
//           // 3,4. .로 split 하고 여러개인거 없애고 다시 합치기
//           List<Character> temp = new_id.toLowerCase().chars()
//                                    .filter(c -> (97 <= c && c <= 122) || //소문자
//                                         (0 <= (c - '0') && (c - '0') <= 9) || // 숫자
//                                         (c == 45) || (c == 95) || (c == 46)) // - _ .
//                                    .mapToObj(i -> (char)i).collect(Collectors.toList());
//           char[] tempChar = new char[temp.size()];
//           for(int i=0; i<temp.size(); i++){
//                tempChar[i] = (char) temp.get(i);
//           }
//           List<String> tempList = Arrays.stream(new String(tempChar).split("\\.")) // .으로 String[] 생성
//                                         .collect(Collectors.toCollection(ArrayList::new)); // ArrayList로 바꿔서
//           tempList.removeAll(Arrays.asList("",null)); // 빈거없애고
//           String answer1 = tempList.stream().collect(Collectors.joining(".")); // string으로 변환
          
//           // 5. 빈문자열이면 a
//           if(answer1 == null || answer1 == "") answer1 = "a";
          
//           //6. 15자리까지만 & 제거후 끝에 . 도 제거
//           if(answer1.length() >= 16){
//                answer1 = answer1.substring(0,15);
//                if(answer1.charAt(answer1.length()-1) == 46){
//                     answer1 = answer1.substring(0,14);
//                }
//           }
//           // 7. 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입
//           if(answer1.length() <=2){
//                if(answer1.length() ==1){
//                     answer1 = answer1.repeat(3);
//                }else{
//                     answer1 += answer1.charAt(1);
//                }
//           }
          
//           return answer1;
//      }
        // 1,2,3단계
          String ans = new_id.toLowerCase()
                              .replaceAll("[^0-9a-z\\-\\_\\.]", "")
                            .replaceAll("\\.\\.+", ".");
          // 4단계
          if(ans.charAt(0) == '.') ans = ans.substring(1);
        if(ans.length() ==0) ans = "a";
          ans = ans.replaceAll("\\.$", "");
          
          //5단계
          if(ans.length() ==0) ans = "a";
          // 6단계
          if(ans.length()>=16){
               ans = ans.substring(0,15);
               ans = ans.replaceAll("\\.$", "");
          }
          // 7단계
          if(ans.length() <3){
               while(ans.length() < 3){
                    ans += ans.charAt(ans.length()-1);
               }
          }
          
          return ans;
     }
}