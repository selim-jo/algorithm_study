import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        // 알파벳 갯수만큼 배열 생성(a:0, z:25)
        int arr[] = new int[26];
        for(int i=0; i<26; i++){
            arr[i]= -1;
        }

        for(int i=0; i<S.length(); i++) {

            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for(int var : arr) {
            System.out.print(var + " ");
        }
   }
}