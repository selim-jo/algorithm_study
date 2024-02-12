public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            Syetem.out.println(1);
        } else {
            Syetem.out.println(0);
        }
   }
}