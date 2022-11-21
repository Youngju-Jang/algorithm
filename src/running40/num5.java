package running40;

//https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class num5 {
     public String solution(String s) {
          byte[] bytes = new byte[s.getBytes().length];
          int i=0; // 단어용
          int index = 0; // 전체용
          for(byte cha : s.getBytes()){
               if(cha==32){ // 공백일경우
                    i=0; //단어 : 다시 0부터 시작
                    bytes[index] = cha;
               }else if(i%2 == 0){//짝수번째 글자 .0번째포함
                    if(cha > 96) {
                         cha -= 32;
                    }
                    i++;
                    bytes[index] = cha;
               }else if(i%2 == 1){ //홀수번째 글자
                    if(cha <97){
                         cha += 32;
                    }
                    i++;
                    bytes[index] = cha;
               }
               index++;
          }
          return new String(bytes);
     }
     
     public static void main(String[] args) {
          num5 test1 = new num5();
          String ans = test1.solution("try   hello world   ");
          System.out.println(ans);
     }
}

//우수답안 지렸따
// public String solution(String s) {
//
//        String answer = "";
//        int cnt = 0;
//        String[] array = s.split("");
//
//        for(String ss : array) {
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }
//      return answer;
//  }