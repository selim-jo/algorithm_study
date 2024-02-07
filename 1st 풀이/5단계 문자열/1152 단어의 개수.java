import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       // nextLine()은 문자 또는 엔터를 치기 전까지의 문장 전체를 입력받음
       String S = sc.nextLine();
       // StringTokenizer 사용 (띄어쓰기를 기준으로 단어를 분류하고, 그 단어들을 토큰이라고 함)
       StringTokenizer str = new StringTokenizer(S, " ");

       System.out.println(str.countTokens());
   }
}