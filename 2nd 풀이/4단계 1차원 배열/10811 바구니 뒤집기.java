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
       // 이 부분 한번 더 확인
       for(int i=0; i<M; i++) {
            int left = sc.nextInt() - 1;
            int right = sc.nextInt() - 1;

            while(left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
       }
       
       sc.close();

       for(int basket : arr) {
            System.out.print(basket + " ");
       }

   }
}