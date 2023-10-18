import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int M = sc.nextInt();

       int[] arr = new int[N];

       for(int i=0; i<M; i++) {
            int I = sc.nextInt(); // i번 바구니부터
            int J = sc.nextInt(); // j번 바구니까지
            int K = sc.nextInt(); // k번 번호 공을 넣음

            for(int j=I-1; j<J; j++) {
                arr[j] = K;
            }
       }

       for(int basket : arr) {
            System.out.print(basket + " ");
       }
   }
}