import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int M = sc.nextInt();

       int[] arr = new int[N]; //바구니

       for(int i=0; i<N; i++) {
            arr[i] = i+1; //바구니 공 초기화
       }

       for(int i=0; i<M; i++) {
            int tmp = 0;
            int I = sc.nextInt();
            int J = sc.nextInt();

            tmp = arr[I-1]; //1번 바구니부터니까 I-1
            arr[I-1] = arr[J-1];
            arr[J-1] = tmp;
       }

       for(int basket : arr) {
            System.out.print(basket + " ");
       }
   }
}