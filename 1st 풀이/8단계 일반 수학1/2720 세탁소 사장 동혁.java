import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       int T = sc.nextInt(); // 테스트 케이스의 개수

       // 출력값
       // 쿼터($0.25=25센트) 개수, 다임($0.10=10센트) 개수, 니켈($0.05=5센트) 개수, 페니($0.01=1센트) 개수
       for(int i=0; i<T; i++) {
            int C = sc.nextInt(); // 입력값: 거스름돈 C (C의 단위는 센트, $1=100센트)

            int quarter = C / 25;
            C %= 25;

            int dime = C / 10;
            C %= 10;

            int nickel = C / 5;
            C %= 5;

            int penny = C;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
       }
   }
}