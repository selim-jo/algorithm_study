// 유클리드 호제법 사용하여 풀이
// 두 수가 주어지면 GCD로 최대공약수를 구해준 다음 두 수의 곱에 구했던 최대공약수를 나눠주면 최소공배수를 구할 수 있음

import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a * b / gcd(a, b));
        }
   }

   // 최대공약수 구하기
   public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
   }
}