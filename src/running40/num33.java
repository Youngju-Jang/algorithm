package running40;

import java.util.stream.Stream;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class num33 {
     public int solution(int n, int[] lost, int[] reserve) {
          // 전체 1 만들기
          int[] stuArr = Stream.generate(() -> 1).limit(n).mapToInt(i -> (int)i).toArray();
          int answer = n;
          for(int i : lost){
               stuArr[i-1] -= 1;
          }
          for(int i : reserve){
               stuArr[i-1] += 1;
          }
          for(int i=0; i<stuArr.length; i++){
               if(stuArr[i] == 0){
                    // 왼쪽에꺼 오른쪽으로 넘기기
                    if(1<=i && stuArr[i-1]==2){
                         stuArr[i-1]--;
                         stuArr[i]++;
                    }
                    // 오른쪽에꺼 왼쪽으로 넘기기
                    else if(i<stuArr.length-1 && stuArr[i+1]==2){
                         stuArr[i+1]--;
                         stuArr[i]++;
                         
                    }else{
                         answer--;
                    }
               }
          }
          return answer;
     }
     
     public static void main(String[] args) {
          num33 test = new num33();
          System.out.println(test.solution(7, new int[]{2,4,7}, new int[]{1,3,5}));
     }
}
