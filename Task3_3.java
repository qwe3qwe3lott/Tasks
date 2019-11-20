import java.util.Scanner;
public class Task3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        double b;
        double j = 0;
        int n = 0;
        for (;true;) {
            System.out.println("введите вещественное число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Double.parseDouble(a);
            j = j + b;
            n++;
            System.out.println("Среднее арифметическое: " + j/n);
        }
        System.out.println("Среднее арифметическое: " + j/n);
    }
}
