import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите три числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b && b == c) System.out.println("3");
        if (a == b && b != c) System.out.println("2");
        if (a == c && c != b) System.out.println("2");
        if (b == c && a != c) System.out.println("2");
        if (a != b && b != c && a != c) System.out.println("1");
    }
}
