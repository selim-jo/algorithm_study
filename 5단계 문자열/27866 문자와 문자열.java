import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       String s = sc.next();
       int i = sc.nextInt();

       // charAt(i) 함수
       // String 변수에서 사용할 수 있으며, i 자리에는 int형 변수를 넣어서 원하는 위치의 문자를 가져올 수 있음
       System.out.println(s.charAt(i-1));
   }
}