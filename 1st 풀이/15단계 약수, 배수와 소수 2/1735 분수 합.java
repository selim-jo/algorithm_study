// 입력값: 첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어짐
// 출력값; 첫째 줄에 구하고자 하는 기약분수(두 분수의 합)의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력
// 유클리드 호제법 이용
// 분모와 분자를 합한 것을 최대공약수로 나눠주면 기약분수를 구할 수 있음

import java.util.Scanner;

public class Main {
   public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int c1, c2, p1, p2;
		
		// c1/p1, c2/p2
		c1 = sc.nextInt();
		p1 = sc.nextInt();
		c2 = sc.nextInt();
		p2 = sc.nextInt();
		
        // 분수 합
		c1 = c1*p2+c2*p1;
		p1 = p1*p2;
		int gcd = getGcd(c1, p1); // 최대공약수
		
		System.out.println(c1/gcd + " " + p1/gcd); // 기약분수 출력
	}
	
	public static int getGcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		return getGcd(b, a%b);
	}
}