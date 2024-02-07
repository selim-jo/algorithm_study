// 기본적으로 브루트포스 방식은 1부터 입력받은 N까지 한개씩 모두 대입하는 거라고 생각하면 됨
// 입력값: a, b, c, d, e, f가 공백으로 차례대로 주어짐
// 출력값: x와 y를 공백으로 구분해 출력함
// ex) ax + by = c
//     dx + ey = f

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {

    //시간초과 코드
    //    Scanner sc = new Scanner(System.in);

    //    // 입력값
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
    //    int c = sc.nextInt();
    //    int d = sc.nextInt();
    //    int e = sc.nextInt();
    //    int f = sc.nextInt();

    //    // 출력값
    //    int answerX = 0;
    //    int answerY = 0;

    //    for(int i=-999; i<1000; i++) {
    //         for(int j=-999; i<1000; j++) {
    //             if(((a*i)+(b*j) == c) && ((d*i)+(e*j) == f)) {
    //                 answerX = i;
    //                 answerY = j;
    //                 break;
    //             }
    //         }
    //    }
    //    System.out.println(answerX + " " + answerY);

    // scanner로 입력값을 받아오니 시간초과가 발생해 BufferedReader 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    // 입력값
    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);
    int c = Integer.parseInt(s[2]);
    int d = Integer.parseInt(s[3]);
    int e = Integer.parseInt(s[4]);
    int f = Integer.parseInt(s[5]);

    // 출력값
    int answerX = 0;
    int answerY = 0;

    for(int i=-999; i<1000; i++){
        for(int j=-999; j<1000; j++){
            if(((a*i)+(b*j) == c) && ((d*i)+(e*j) == f)){
                answerX = i;
                answerY = j;
                break;
            }
        }
    }
    System.out.println(answerX + " " + answerY);
   }
}