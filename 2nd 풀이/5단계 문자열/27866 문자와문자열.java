import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String S = sc.next();
       int i = sc.nextInt();
       
       // charAt(i): i번째 문자값 가져오기, String에서 사용 가능
       System.out.println(S.chartAt(i-1));
   }
}