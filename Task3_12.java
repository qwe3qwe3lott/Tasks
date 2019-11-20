import java.util.Scanner;
public class Task3_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int i = 0;
        int j = 1;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (b == j) {
                j++;
                if (j == 7) {
                    i++;
                    j = 1;
                }
            } else if (b == 1) {
                j = 2;
            } else {
                j = 1;
            }
            System.out.println("Количество вхождений фрагментов: " + i);
        }
        System.out.println("Количество вхождений фрагментов: " + i);
    }
}
