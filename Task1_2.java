import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите три числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b && b == c) System.out.println("Второго по величине числа нет, все три числа одинаковы!");
        if (a > b && a > c) {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        }
        if (b > c && b > a) {
            if (c > a) System.out.println(c);
            else System.out.println(a);
        }
        if (c > a && c > b) {
            if (a > b) System.out.println(a);
            else System.out.println(b);
        }
        if (a == b) {
            if (c > a) System.out.println(a);
            if (c < a) System.out.println(c);
        }
        if (a == c) {
            if (b > a) System.out.println(a);
            if (b < a) System.out.println(b);
        }
        if (c == b) {
            if (c > a) System.out.println(a);
            if (c < a) System.out.println(c);
        }
    }
}
