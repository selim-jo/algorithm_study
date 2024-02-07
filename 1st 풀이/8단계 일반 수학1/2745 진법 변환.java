// 진법에 대한 이해 필요
// 어떤 진수든 10진수로 바꾸는 방법은 같음

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       String N = sc.next();
       int B = sc.nextInt();
       
       int tmp = 1;
       int ans = 0;

       for(int i=N.length()-1; i>=0; i--) {
            char c = N.charAt(i);

            // 'A'-'Z' (65-90), 'a'-'z' (97-122)
            // 'A'-'Z'는 숫자로 바꿔줌
            if('A'<=c && c<='Z') {
                ans += (c-'A'+10) * tmp;
            } else {
                ans += (c-'0') * tmp;
            }
            tmp *= B;
       }

       System.out.println(ans);
   }
}