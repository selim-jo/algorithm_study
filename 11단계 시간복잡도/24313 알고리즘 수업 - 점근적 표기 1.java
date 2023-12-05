// bigO 표기법

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int a = f1*n + f2; //f(n)
        int b = c*n; //c*g(n)

        // 출력값
        if (a <= b && f1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

   }
}