import java.util.Scanner;
public class Task3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int j = Integer.MIN_VALUE;
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            n++;
            if (b > j) {
                n1 = n;
                n2 = n;
                j = b;
            } else if (b == j) {
                n2 = n;
            }
            System.out.println("Номер первого максимального элемента: " + n1);
            System.out.println("Номер последнего максимального элемента: " + n2);
        }
        System.out.println("Номер первого максимального элемента: " + n1);
        System.out.println("Номер последнего максимального элемента: " + n2);
    }
}
