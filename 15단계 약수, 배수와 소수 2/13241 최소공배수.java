// 유클리드 호제법 사용하여 풀이
// 두 수가 주어지면 GCD로 최대공약수를 구해준 다음 두 수의 곱에 구했던 최대공약수를 나눠주면 최소공배수를 구할 수 있음

import java.util.Scanner;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값 (큰 수 입력에 대하여 변수를 64비트 정수로 선언)
        long a = sc.nextLong();
        long b = sc.nextLong();

        // 출력값
        long result = (a * b) / gcd(a, b);
        
        System.out.println(result);
   }

   // 최대공약수 구하기 (최대공약수 구하는 걸 외우는게 좋을 듯)
   public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
   }
}

// ex) 2, 5가 있다고 했을 때,
// gcd(2, 5) ->  gcd(5, 2) -> gcd(2, 1) -> gcd(1, 0) -> 1
// result = (2 * 5) / gcd(2,5) -> result = 10 / 1 = 10