import java.util.Scanner;
import java.util.ArrayList;
public class Task3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> lol = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        boolean f = true;
        int n = 0;
        for (;true;) {
            System.out.println("Введите целое число или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (lol.size() == 0) {
                lol.add(b*b);
                n++;
            }
            for (int i = 0; i < lol.size(); i++) {
                if (lol.get(i).equals(b*b)) {
                    f = false;
                }
            }

            if (f) {
                lol.add(b*b);
                n++;
            }
            f = true;
            System.out.println("Количество различных значений квадратов: " + n);
        }
        System.out.println("Количество различных значений квадратов: " + n);
    }
}
