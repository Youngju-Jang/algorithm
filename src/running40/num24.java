package running40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class num24 {
     public String solution(String new_id) {
          // 1차 처리
          // 1.대문자 > 소문자
          // 2.filter 로 제외문자 모두제거
          // 3,4. .로 split 하고 여러개인거 없애고 다시 합치기
          List<Character> temp = new_id.toLowerCase().chars()
                                   .filter(c -> (97 <= c && c <= 122) || //소문자
                                        (0 <= (c - '0') && (c - '0') <= 9) || // 숫자
                                        (c == 45) || (c == 95) || (c == 46)) // - _ .
                                   .mapToObj(i -> (char)i).collect(Collectors.toList());
          char[] tempChar = new char[temp.size()];
          for(int i=0; i<temp.size(); i++){
               tempChar[i] = (char) temp.get(i);
          }
          List<String> tempList = Arrays.stream(new String(tempChar).split("\\.")) // .으로 String[] 생성
                                        .collect(Collectors.toCollection(ArrayList::new)); // ArrayList로 바꿔서
          tempList.removeAll(Arrays.asList("",null)); // 빈거없애고
          String answer1 = tempList.stream().collect(Collectors.joining(".")); // string으로 변환
          
          // 5. 빈문자열이면 a
          if(answer1.equals("")) answer1 = "a";
          
          //6. 15자리까지만 & 제거후 끝에 . 도 제거
          if(answer1.length() >= 16){
               answer1 = answer1.substring(0,15);
               if(answer1.charAt(answer1.length()-1) == 46){
                    answer1 = answer1.substring(0,14);
               }
          }
          // 7. 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입
          if(answer1.length() <=2){
               while(answer1.length()<=2){
                    answer1 += answer1.charAt(answer1.length()-1);
               }
          }
          
          return answer1;
     }
     
     public static void main(String[] args) {
          num24 test = new num24();
          System.out.println(test.solution(	"=.="));
     
          
     }
}

// 다른사람 답안
//public String solution(String new_id) {
//        String answer = "";
//        String temp = new_id.toLowerCase();
//
//        temp = temp.replaceAll("[^-_.a-z0-9]","");
//        System.out.println(temp);
//        temp = temp.replaceAll("[.]{2,}",".");
//        temp = temp.replaceAll("^[.]|[.]$","");
//        System.out.println(temp.length());
//        if(temp.equals(""))
//            temp+="a";
//        if(temp.length() >=16){
//            temp = temp.substring(0,15);
//            temp=temp.replaceAll("^[.]|[.]$","");
//        }
//        if(temp.length()<=2)
//            while(temp.length()<3)
//                temp+=temp.charAt(temp.length()-1);
//
//        answer=temp;
//        return answer;
//    }