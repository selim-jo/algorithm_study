import java.util.*;

public class Main {
   public static void main(String args[]) {
       // 핵심
       // 1. 현재 알파벳과 다음 알파벳이 다른 경우
       // 2. 다음 알파벳이 전체 문장에 없으면 됨

       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       int count = num;

       for(int i=0; i<num; i++) {
            String str = sc.next();
            boolean alphabet[] = new boolean[26]; // 처음에 다 false로 되어있음
            
            for(int j=0; j<str.length()-1; j++) {
                // 현재 알파벳과 다음 알파벳이 다른 경우
                if(str.charAt(j) != str.charAt(j+1)) {
                    // 다음 알파벳이 전체 문장에 없음
                    if(alphabet[str.charAt(j+1)-97]==true) {
                        count--;
                        break;
                    }
                }
                alphabet[str.charAt(j)-97] = true;
            }
       }
       System.out.println(count);
   }
}