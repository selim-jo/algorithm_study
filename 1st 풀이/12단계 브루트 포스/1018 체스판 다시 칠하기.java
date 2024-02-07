// 입력값: N, M, N*M으로 이루어진 보드 
// 출력값: 다시 칠해야 하는 정사각형 개수의 최솟값
// 구글링해서 문제 풀이, But 이해 필요

import java.util.*;

public class Main {
   
   public static boolean[][] arr;
   public static int min = 64; // 8*8 크기(최소로 칠할 수 있는 크기)

   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int m = sc.nextInt();

       arr = new boolean[n][m];

       // 배열 입력 
       for(int i=0; i<n; i++) {
            String str = sc.next();

            for(int j=0; j<m; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true; // W일 때는 true
                } else {
                    arr[i][j] = false; // B일 때는 false
                }
            }
       }

       int n_row = n - 7;
       int m_col = n - 7;

       for(int i=0; i<n_row; i++) {
            for(int j=0; j<m_col; j++) {
                find(i, j);
            }
       }
       System.out.println(min);
   }

   // 다시 칠해야 하는 정사각형의 개수의 최솟값을 구하기 위한 find 메소드
   public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y]; // 첫 번째 칸의 색

        for(int i=x; i<end_x; i++) {
            for(int j=y; j<end_y; j++) {

                // 올바른 색이 아닐 경우 count 1 증가
                if(arr[i][j] != TF) {
                    count++;
                }

                // 다음 칸은 색이 바뀌므로 true라면 false, false이면 true로 값 변경
                TF = (!TF);
            }

            TF = !TF;
        }

        // 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
        // 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
        // 색칠 할 개수(64-count) 중 최솟값을 count에 저장
        count = Math.min(count, 64 - count);

        // 최솟값 갱신
        min = Math.min(min, count);
   } 
}