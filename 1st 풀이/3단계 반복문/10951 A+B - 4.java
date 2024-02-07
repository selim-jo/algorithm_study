import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

        // 정수 입력시 true를 반환하고 그렇지 않은 경우 false 반환
        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
   }
}