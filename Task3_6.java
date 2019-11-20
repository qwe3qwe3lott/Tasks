import java.util.Scanner;
public class Task3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int n = 0;
        int j = 0;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            n++;
            if (b == 0 && j == 0) {
                j = n;
            }
            System.out.println("Номер первого элемента, равного нулю: " + j);
        }
        System.out.println("Номер первого элемента, равного нулю: " + j);
    }
}
