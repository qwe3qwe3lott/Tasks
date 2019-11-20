import java.util.Scanner;
public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int i = 0;
        int j = Integer.MIN_VALUE;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (b > j) {
                j = b;
                i = 1;
            } else if (b == j) {
                i++;
            }
            System.out.println("Количество максимальных элементов: " + i);
        }
        System.out.println("Количество максимальных элементов: " + i);
    }
}
