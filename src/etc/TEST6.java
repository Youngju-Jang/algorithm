package etc;

public class TEST6 {
     public void solution(int[][] arr) {
          String[][] answer = new String[5][5] ;
          int max = arr.length-1; // 4
          for(int i=0; i< arr.length; i++){
               for(int j=0; j<arr.length; j++){
                    // 각 모서리
                    if(i==0 && j==0){
                         answer[0][0] = (arr[0][0] == Math.max(Math.max(arr[0][0],arr[0][1]),arr[1][0]))? "*" : String.valueOf(arr[0][0]);
                    }else if(i==0 && j==max){
                         answer[0][max] = (arr[0][max] == Math.max(Math.max(arr[0][max],arr[0][max-1]),arr[1][max]))? "*" : String.valueOf(arr[0][max]);
                    }else if(i==max && j==0){
                         answer[max][0] = (arr[max][0] == Math.max(Math.max(arr[max][0],arr[max-1][0]),arr[max][1]))? "*" : String.valueOf(arr[max][0]);
                    }else if(i==max && j==max){
                         answer[max][max] = (arr[max][max] == Math.max(Math.max(arr[max][max],arr[max-1][max]),arr[max][max-1]))? "*" : String.valueOf(arr[max][0]);
                    }else if(i==0){ // 모서리제외 제일 윗줄
                         answer[0][j] = (arr[0][j] == Math.max(Math.max(Math.max(arr[0][j],arr[0][j-1]),arr[0][j+1]),arr[1][j]))? "*" : String.valueOf(arr[0][j]);
                    }else if(j==0){ // 모서리제외 제일 왼쪽줄
                         answer[i][0] = (arr[i][0] == Math.max(Math.max(Math.max(arr[i][0],arr[i-1][0]),arr[i][1]),arr[i+1][0]))? "*" : String.valueOf(arr[i][0]);
                    }else if(j==max){ // 모서리제외 제일 오른쪽줄
                         answer[i][max] = (arr[i][4] == Math.max(Math.max(Math.max(arr[i][max],arr[i-1][max]),arr[i][max-1]),arr[i+1][max]))? "*" : String.valueOf(arr[i][max]);
                    }else if(i==max){ // 모서리제외 제일 아랫줄
                         answer[max][j] = (arr[max][j] == Math.max(Math.max(Math.max(arr[max][j],arr[max-1][j]),arr[max][j-1]),arr[max][j+1]))? "*" : String.valueOf(arr[max][j]);
                    }else{ // 나머지 안쪽
                         answer[i][j] = (arr[i][j] == Math.max(Math.max(Math.max(Math.max(arr[i][j],arr[i-1][j]),arr[i][j-1]),arr[i][j+1]),arr[i+1][j]))? "*" : String.valueOf(arr[i][j]);
                    }
               }
          }
          for(int i=0; i<answer.length; i++){
               System.out.print(String.join(" ", answer[i]));
               if(i!=answer.length-1) System.out.println();
          }
     }
     
     public static void main(String[] args) {
          TEST6 method = new TEST6();
          int[][] arr1 = {{3,4,1,4,9},{2,9,4,5,8},{9,0,8,2,1},{7,0,2,8,4},{2,7,2,1,4}};
          
          method.solution(arr1);
     }
}
