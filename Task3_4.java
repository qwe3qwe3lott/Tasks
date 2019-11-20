import java.util.Scanner;
public class Task3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int j = Integer.MIN_VALUE;
        int i = 1;
        int maxi = 0;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (b == j) {
                i++;
            } else {
                i = 1;
            }
            if (i > maxi) {
                maxi = i;
            }
            j = b;
            System.out.println("Максимальное число идущих подряд одинаковых элементов: " + maxi);
        }
        System.out.println("Максимальное число идущих подряд одинаковых элементов: " + maxi);
    }
}
