import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       boolean[] arr = new boolean[31]; // boolean 타입은 선언하면서 false로 초기화됨

       for(int i=0; i<28; i++) {
            arr[sc.nextInt()] = true;
       }

       for(int i=1; i<=30; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
       }

   }
}