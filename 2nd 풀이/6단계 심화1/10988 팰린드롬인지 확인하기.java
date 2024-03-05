import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {
       // 입력
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // 출력
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       // reverse() 함수를 사용하려 했으나 String 클래스에는 reverse() 메서드가 없음
       StringBuilder sb = new StringBuilder(br.readLine());

       // 출력 (문자 == 거꾸로한 문자 -> 1, 아니면 0)
       bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
       // 남아있는 데이터 모두 출력
       bw.flush();
       // 스트림 닫음
       bw.close();
       br.close();
   }
}