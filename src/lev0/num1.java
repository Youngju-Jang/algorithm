package lev0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120842/solution_groups?language=java
public class num1 {
     public int[][] solution(int[] num_list, int n) {
          int x = (int)Math.ceil(num_list.length/(double)n);
          int[][] answer = new int[x][n];
          int i=0;
          for(int j=0; j<x; j++){
               for(int z=0; z<n; z++){
                    answer[j][z] = num_list[i++];
                    if(i >= num_list.length) return answer;
               }
          }
          
          return answer;
     }
}

