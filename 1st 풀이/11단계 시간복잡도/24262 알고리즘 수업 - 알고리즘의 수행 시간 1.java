// 입력값: 입력 크기 n
// 출력값: 첫째 줄에 코드1의 수행 횟수 출력
//     : 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수 출력
// 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력함

// 문제 이해 안돼 구글링함

// ManOfPassion 알고리즘
// ManOfPassion(A[], n) {
//     i =[n / 2];
//     return A[i]; # 코드1
// }

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int n = sc.nextInt();

        sc.close();

        // 출력값
        // ManOfPassion 알고리즘은 입력값에 관계없이 1번만 수행되는 알고리즘이므로 첫째줄에는 1 출력
        // 둘째 줄에 코드1의 횟수를 다항식으로 나타내었을 때, 상수로만 이루어진 단항식이므로 최고 차수가 0이므로 0 출력
        System.out.println(1);
        System.out.println(0);
   }
}