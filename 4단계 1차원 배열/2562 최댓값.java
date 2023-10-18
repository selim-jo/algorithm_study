import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int[] arr = new int[9];
       int max = arr[0];
       int index = 0;
       
       for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
       }

       for(int j=0; j<arr.length; j++) {
            if(arr[j] > max) {
                max = arr[j];
                index = j+1;
            }
       }
       System.out.println(max);
       System.out.println(index);
   }
}