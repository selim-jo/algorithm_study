import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[30]; // false로 초기화

        // sc.nextInt()값은 true로
        for(int i=0; i<28; i++) {
            arr[sc.nextInt()] = true;
        }

        // arr 배열의 해당 인덱스 값이 false이면 값 출력
        for(int i=1; i<=30; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
   }
}