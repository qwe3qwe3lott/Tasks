import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}