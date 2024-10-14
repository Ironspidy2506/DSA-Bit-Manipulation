import java.util.*;

public class Complement_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            n = n / 2;
        }

        System.out.println(sb.reverse().toString());

        sc.close();
    }
}