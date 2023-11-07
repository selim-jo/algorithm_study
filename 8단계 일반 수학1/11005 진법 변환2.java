// 진법에 대한 이해 필요
// 10진수 -> n진수 변환

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int B = sc.nextInt();

        // 10진수 -> n진수 변환
       // integer.toString(바꿀수, 바꿀진법) 
       System.out.println(Integer.toString(N, B).toUpperCase());
   }
}