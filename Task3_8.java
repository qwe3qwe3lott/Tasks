import java.util.Scanner;
public class Task3_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int i = 0;
        int j = Integer.MIN_VALUE;
        int j2 = Integer.MIN_VALUE;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (b > j && j == Integer.MIN_VALUE) {
                j = b;
            } else if (b > j) {
                j2 = j;
                j = b;
            } else if (b > j2 && b < j) {
                j2 = b;
            }
            if (j2 == Integer.MIN_VALUE) {
                System.out.println("NO");
            } else {
                System.out.println("Второй по величине элемент: " + j2);
            }
        }
        if (j2 == Integer.MIN_VALUE) {
            System.out.println("NO");
        } else {
            System.out.println("Второй по величине элемент: " + j2);
        }
    }
}
