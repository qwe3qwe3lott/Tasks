import java.util.Scanner;
public class Task2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double x1 = b * b - 4 * a * c;
        if (x1 < 0) System.out.println("Дискрименант не положителен!");
        else {
            x1 = Math.sqrt(x1);
            double x2 = (b + x1) / (2 * a);
            x1 = (b - x1) / (2 * a);
            System.out.println("Корни:");
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
