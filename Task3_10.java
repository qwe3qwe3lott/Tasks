import java.util.Scanner;
public class Task3_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int i = 0;
        int i2 = 1;
        int j = Integer.MIN_VALUE;
        int endi = 0;
        int endi2 = 0;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (b > j) {
                i++;
            } else {
                i = 1;
            }
            if (i > endi) {
                endi = i;
            }
            if (b < j) {
                i2++;
            } else {
                i2 = 1;
            }
            if (i2 > endi2) {
                endi2 = i2;
            }
            j = b;
            if (endi > endi2) {
                System.out.println("Максимальная длина монотонного участка: " + endi);
            } else {
                System.out.println("Максимальная длина монотонного участка: " + endi2);
            }
        }
        if (endi > endi2) {
            System.out.println("Максимальная длина монотонного участка: " + endi);
        } else {
            System.out.println("Максимальная длина монотонного участка: " + endi2);
        }
    }
}
