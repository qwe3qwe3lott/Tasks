import java.util.Scanner;
public class Task3_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int b;
        int i = 0;
        boolean f = false;
        for (;true;) {
            System.out.println("Введите ноль, или единицу, или 'no' для завершения");
            a = in.next();
            if (a.equals("no")) {
                break;
            }
            b = Integer.parseInt(a);
            if (b == 1 && !f) {
                f = true;
                i++;
            } else if (b == 0) {
                f = false;
            }
            System.out.println("Число групп из единиц: " + i);
        }
        System.out.println("Число групп из единиц: " + i);
    }
}
