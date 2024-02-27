import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); // 문장 전체 입력받음
        StringTokenizer str = new StringTokenizer(S, " "); // 띄어ㅆ기 기준으로 단어 불류하고 str에 담아줌

        System.out.println(str.countTokens()); // str에 있는 개수
   }
}