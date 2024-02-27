import java.util.*;

public class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();

      // 입력받은 숫자를 StringBuilder 객체에 넣고, 뒤집은 다음 숫자형으로 변환
      A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
      B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

      // A가 B보다 크면 A 출력, 그 반대면 B 출력
      System.out.println(A > B ? A : B);
   }
}