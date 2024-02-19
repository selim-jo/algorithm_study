import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       int[] arr = new int[N];

       // 바구니 공 초기화 (처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있음)
       for(int i=0; i<N; i++) {
            arr[i] = i+1;
       }
       
       // M개의 줄에 걸쳐서 공을 교환할 때
       for(int i=0; i<M; i++) {
            int tmp = 0;
            int I = sc.nextInt();
            int J = sc.nextInt();

            // 공 교환
            tmp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = tmp;
       }

       for(int basket : arr) {
            System.out.print(basket + " ");
       }
   }
}