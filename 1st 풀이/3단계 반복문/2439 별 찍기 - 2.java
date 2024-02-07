import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int T = sc.nextInt();

       for(int i=1; i <= T; i++) {
            // 빈값 출력
            for(int j=T; j > i; j--) {
                System.out.print(" ");
            }
            // "*" 출력
            for(int j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
       }
   }
}