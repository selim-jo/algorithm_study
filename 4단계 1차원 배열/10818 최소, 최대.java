import java.util.Scanner;

// 메모리 너무 많이 잡아먹음 - Buffer 사용해서 해보기
public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int N = sc.nextInt();
       int[] arr = new int[N];

       for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
       }       

       int min = arr[0];
       int max = arr[0];

       for(int j=0; j<arr.length; j++) {
            if(arr[j] < min) {
                min = arr[j];
            }
            if(arr[j] > max) {
                max = arr[j];
            }
       }
       System.out.print(min + " ");
       System.out.print(max);
   }
}