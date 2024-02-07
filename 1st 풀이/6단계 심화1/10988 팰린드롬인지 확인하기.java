import java.util.*;
import java.io.*;

// java.io.* import 해올 때 throws IOException 해줘야함
public class Main {
   public static void main(String args[]) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       // reverse() 함수를 사용하려 했으나 String 클래스에는 reverse() 메서드가 없음
       StringBuilder sb = new StringBuilder(br.readLine());

       bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
       bw.flush(); // 남아있는 데이터 모두 출력
       bw.close(); // 스트림 닫음
       br.close();
   }
}