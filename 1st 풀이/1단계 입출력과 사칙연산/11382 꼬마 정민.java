import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       //int보다 더 큰 값 출력할 수 있으므로 long 사용
       long A = sc.nextLong();
       long B = sc.nextLong();
       long C = sc.nextLong();
       
       System.out.println(A+B+C);
   }
}