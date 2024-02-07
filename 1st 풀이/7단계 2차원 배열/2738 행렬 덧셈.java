import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int M = sc.nextInt();

       int[][] arrA = new int[N][M];
       int[][] arrB = new int[N][M];

       // arrA 배열 입력값
       for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arrA[i][j] = sc.nextInt();
            }
       }

       // arrB 배열 입력값
       for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arrB[i][j] = sc.nextInt();
            }
       }

       // arrA + arrB 배열의 합
       for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(arrA[i][j] + arrB[i][j] + " ");
            
                if(j== M-1) {
                    System.out.println();
                }
            }
       }
   }
}