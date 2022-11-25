package etc;

//https://teamsparta.notion.site/99-10-d5a648771ace49799163a44ad878ce0d
public class TEST6_2 {
     public void solution(int[][] arr) {
          String[][] answer = new String[5][5];
          int max = arr.length - 1; // 4
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length; j++) {
                    int[] left = {i, j - 1};
                    int[] right = {i, j + 1};
                    int[] up = {i - 1, j};
                    int[] down = {i + 1, j};
                    // 각 가장자리
                    if (i == 0) up[0] = i; // 제일 윗줄
                    if (i == max) down[0] = i; // 제일 아랫줄
                    if (j == 0) left[1] = j; // 제일 왼쪽줄
                    if (j == max) right[1] = j; // 제일 오른쪽줄
                    
                    answer[i][j] = (arr[i][j] == Math.max(Math.max(Math.max(Math.max(arr[i][j], arr[left[0]][left[1]]), arr[right[0]][right[1]]), arr[up[0]][up[1]]), arr[down[0]][down[1]])) ? "*" : String.valueOf(arr[i][j]);
               }
          }
          for (int i = 0; i < answer.length; i++) {
               System.out.print(String.join(" ", answer[i]));
               if (i != answer.length - 1) System.out.println();
          }
     }
     
     public static void main(String[] args) {
          TEST6_2 method = new TEST6_2();
          int[][] arr1 = {{3, 4, 1, 4, 9}, {2, 9, 4, 5, 8}, {9, 0, 8, 2, 1}, {7, 0, 2, 8, 4}, {2, 7, 2, 1, 4}};
          
          method.solution(arr1);
     }
}
