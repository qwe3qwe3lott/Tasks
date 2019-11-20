import java.util.Scanner;
public class Task3_7 {
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
                i++;
            }
            j = b;
            System.out.println("Число элементов, больше предыдущих: " + i);
        }
        System.out.println("Число элементов, больше предыдущих: " + i);
    }
}
