import java.util.Scanner;
public class Task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер простого числа:");
        int a = in.nextInt();
        int f = 1;
        int d = 0;
        int b = 0;
        for (int i = 2; ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                d = i;
                b++;
            }
            else f = 1;
            if (b == a) break;
        }
        System.out.println(d);
    }
}
