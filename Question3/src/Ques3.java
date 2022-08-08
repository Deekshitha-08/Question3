import java.util.*;
public class Ques3 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String n = s.next();
        String m = s.next();
        int len = s.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(n + " ");
            }
            for (int k = len - i - 1; k > 0; k--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
