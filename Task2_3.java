import java.util.Scanner;
public class Task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите координату:");
        float a = in.nextFloat();
        if (a < 0) System.out.println(Math.abs(a));
        if (a > 1) System.out.println(a - 1);
        if (a >= 0 && a <= 1) System.out.println("Заданная координата уже лежит на отрезке");
    }
}
