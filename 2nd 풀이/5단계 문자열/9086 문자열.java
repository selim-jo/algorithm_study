import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            String str = sc.next();
            System.out.print(str.charAt(i));
            System.out.println(str.charAt(T.length() - 1));
        }
   }
}