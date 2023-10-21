import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int A = sc.nextInt();
       int B = sc.nextInt();

       // reverse() 함수를 사용하려 했으나 String 클래스에는 reverse() 메서드가 없음

       A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
       B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

       System.out.print(A > B ? A : B);
   }
}