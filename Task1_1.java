import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите три числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Среди введённых чисел есть одинаковые");
        }
        else {
            System.out.println("Среди введённых чисел нет одинаковых");
        }
    }
}
