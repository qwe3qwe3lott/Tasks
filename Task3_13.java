import java.util.Scanner;
public class Task3_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int i = 0;
        int j = 1;
        int c = 0;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);

            if (b == j) {
                i++;
                if (i%2 == 1) {
                    j++;
                } else {
                    j--;
                }
            } else if (b == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (i >= 6 && i%2 == 0) {
                c++;
            }
            System.out.println("Количество вхождений фрагментов: " + c);
        }
        System.out.println("Количество вхождений фрагментов: " + c);
    }
}

