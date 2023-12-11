// 입력값: N, M, N*M으로 이루어진 보드 
// 출력값: 다시 칠해야 하는 정사각형 개수의 최솟값
// 내일까지 더 풀어보기

import java.util.*;

public class Main {
   
   public static boolean[][] arr;
   public static int min = 64; // 8*8

   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int m = sc.nextInt();

       arr = new boolean[n][m];

       // 배열 입력 
       for(in i=0; i<n; i++) {
            String str = sc.next();

            for(int j=0; j<m; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true; // W일 때는 true
                } else {
                    arr[i][j] = false; // B일 때는 false
                }
            }
       }




   }
}