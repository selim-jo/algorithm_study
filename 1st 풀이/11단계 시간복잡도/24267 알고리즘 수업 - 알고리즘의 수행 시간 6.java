// 시간복잡도를 가장한 수학문
// 이 문제 완전 이해 안되었음
// 입력값: 입력 크기 n
// 출력값: 첫째 줄에 코드1의 수행 횟수 출력
//     : 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수 출력
// 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력함

// ManOfPassion 알고리즘
//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n - 2
//        for j <- i + 1 to n - 1
//            for k <- j + 1 to n
//                sum <- sum + A[i] x A[j] x A[k]; #코드1
//    return sum;
//}
// 위 알고리즘의 시간 복잡도는 n^3+3

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        Long n = sc.nextLong()-2;

        sc.close();

        // 출력값
        // ManOfPassion 알고리즘은 위와 같이 반복 수행되는 알고리즘이므로 첫째줄에는 ((n*n*n)+(3*n*n)+(2*n))/6 출력
        // 둘째 줄에 코드1의 횟수를 다항식으로 나타내었을 때, 므로 최고 차수가 3이므로 3 출력
        System.out.println(((n*n*n)+(3*n*n)+(2*n))/6);
        System.out.println(3);
   }
}