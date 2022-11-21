package running40;

// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class num25 {
     public int solution(int left, int right) {
          int cnt; // 약수 카운트
          int answer = 0;
          for(int i=left; i<= right; i++){
               cnt = 2;
               if(i==1){
                    answer -= 1;
               }else{
                    for(int j=2; j<=i/2; j++){ // 1~중간까지
                         if(i%j == 0) cnt++; // 약수 카운트
                    }
                    if(cnt%2 ==0){
                         answer += i;
                    }else {
                         answer -= i;
                    }
               }
          }
          return answer;
     }
     public static void main(String[] args) {
          num25 test = new num25();
          System.out.println(test.solution(1, 3));
     }
}

