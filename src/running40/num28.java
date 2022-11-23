package running40;

import java.util.Arrays;
import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class num28 {
     // 각각 map으로 "배수리스트" : "카운트" 배열만들기 ok
     // 최대공약수 : 두 map에서 공통된 키값 ^ 둘중작은value 값
     public int[] solution(int n, int m) {
          HashMap<Integer, Integer> nMap = makeMap(n);
          HashMap<Integer, Integer> mMap = makeMap(m);
          
          int[] answer = {makeMax(nMap, mMap), makeMin(nMap, mMap)};
          return answer;
     }
     // 약수리스트 만들기
     public HashMap<Integer, Integer> makeMap(int given){
          HashMap<Integer, Integer> map = new HashMap<>();
          int i =  2;
          int last = given;
          while(i<=last){
               if(last%i == 0){
                    if(map.get(i) != null){
                         map.put(i, map.get(i)+1);
                    }else {
                         map.put(i, 1);
                    }
                    last /= i;
               }else if(i*i == given){
                    map.put(i, 2);
               }else {
                    i++;
               }
          }
          return map;
     }
     
     // 최대공약수 구하기
     public int makeMax(HashMap<Integer, Integer> n, HashMap<Integer, Integer> m){
          int result= 1;
          for(int k : n.keySet()){
               if(m.get(k) != null){
                    result *= Math.pow(k, Math.min(n.get(k), m.get(k)));
               }
          }
          return result;
     }
     //최소공배수
     public int makeMin(HashMap<Integer, Integer> n, HashMap<Integer, Integer> m){
          int result= 1;
          //공통값의 최대지수로 ^
          for(int k : n.keySet()){
               if(m.get(k) != null){ //공통인값
                    result *= Math.pow(k, Math.max(n.get(k), m.get(k)));
               }else{ // m에 없는 n값
                    result *= Math.pow(k, n.get(k));
               }
          }
          // 공통아닌거 전부 *
          for(int k : m.keySet()){
               if(n.get(k) == null){ // n에 없는 m값
                    result *= Math.pow(k, m.get(k));
               }
          }
          return result;
     }
     
     
     public static void main(String[] args) {
          num28 test = new num28();
          test.makeMap(60).forEach((k, v)-> System.out.println(k+ " : " + v));
          System.out.println(test.makeMax(test.makeMap(60), test.makeMap(48)));
          System.out.println(test.makeMin(test.makeMap(60), test.makeMap(48)));
     
          System.out.println(Arrays.toString(test.solution(2, 16)));
          System.out.println(60 % 48);
     }
     // 다른분 코드
//     // 유클리드 호제법
//     class TryHelloWorld {
//          public int[] gcdlcm(int a, int b) {
//               int[] answer = new int[2];
//
//               answer[0] = gcd(a,b);
//               answer[1] = (a*b)/answer[0];
//               return answer;
//          }
//
//          public static int gcd(int p, int q)
//          {
//               if (q == 0) return p;
//               return gcd(q, p%q);
//          }
}
